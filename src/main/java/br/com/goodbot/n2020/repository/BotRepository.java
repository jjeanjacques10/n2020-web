package br.com.goodbot.n2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.goodbot.n2020.model.BotModel;

@Repository
public interface BotRepository extends JpaRepository<BotModel, Long> {

}
