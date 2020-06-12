package br.com.goodbot.n2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.goodbot.n2020.model.SegmentModel;

@Repository
public interface SegmentRepository extends JpaRepository<SegmentModel, Long> {

}
