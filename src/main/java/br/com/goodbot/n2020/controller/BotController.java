package br.com.goodbot.n2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.goodbot.n2020.model.BotModel;
import br.com.goodbot.n2020.repository.BotRepository;

@Controller
@RequestMapping("/bot")
public class BotController {

	private static final String FOLDER = "bot/";
	
	@Autowired
	public BotRepository botRepository;

	@GetMapping("/form")
	public String open(@RequestParam String page, @RequestParam(required = false) Long id,
			@ModelAttribute("botModel") BotModel botModel, Model model) {

		if ("editBot".equals(page)) {
			model.addAttribute("botModel", botRepository.findById(id).get());
		}

		return FOLDER+page;
	}

	@GetMapping()
	public String findAll(Model model) {
		System.out.println(botRepository.findAll());
		model.addAttribute("bots", botRepository.findAll());
		return "index";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {

		model.addAttribute("bot", botRepository.findById(id).get());
		return "viewBot";
	}
}
