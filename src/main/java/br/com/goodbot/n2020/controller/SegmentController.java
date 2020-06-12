package br.com.goodbot.n2020.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.goodbot.n2020.model.SegmentModel;
import br.com.goodbot.n2020.repository.SegmentRepository;
import br.com.goodbot.n2020.repository.SegmentRepository;

@Controller
@RequestMapping("/segment")
public class SegmentController {

	private static final String FOLDER = "segment/";

	@Autowired
	public SegmentRepository segmentRepository;

	@GetMapping("/form")
	public String open(@RequestParam String page, @RequestParam(required = false) Long id,
			@ModelAttribute("segmentModel") SegmentModel segmentModel, Model model) {

		if ("editSegment".equals(page)) {
			model.addAttribute("segmentModel", segmentRepository.findById(id).get());
		}

		return FOLDER + page;
	}

	@GetMapping()
	public String findAll(Model model) {
		System.out.println(segmentRepository.findAll());
		model.addAttribute("segments", segmentRepository.findAll());
		return FOLDER + "index";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {

		model.addAttribute("segment", segmentRepository.findById(id).get());
		return FOLDER + "viewSegment";
	}

	@PostMapping()
	public String save(@Valid SegmentModel segmentModel, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {

		if (bindingResult.hasErrors()) {
			return FOLDER + "addSegment";
		}

		segmentRepository.save(segmentModel);
		redirectAttributes.addFlashAttribute("messages", "Segment cadastrado com sucesso!");

		return "redirect:/segment";
	}

	@PutMapping("/{id}")
	public String update(@PathVariable("id") long id, @Valid SegmentModel segmentModel, BindingResult bindingResult,
			RedirectAttributes redirectAttributes, Model model) {

		if (bindingResult.hasErrors()) {
			return FOLDER + "editSegment";
		}

		segmentModel.setId(id);
		segmentRepository.save(segmentModel);
		redirectAttributes.addFlashAttribute("messages", "Segment alterado com sucesso!");

		return "redirect:/segment";
	}

	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {

		segmentRepository.deleteById(id);
		redirectAttributes.addFlashAttribute("messages", "Segment exclu�do com sucesso!");

		return "redirect:/segment";
	}
}
