package br.com.goodbot.n2020.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name = "TB_PRODUTO")
public class SegmentModel {

	private int id_segment;
	private String name;

	public SegmentModel() {
	}

	public SegmentModel(int id_segment, String name) {
		super();
		this.id_segment = id_segment;
		this.name = name;
	}

	@Id
	@Column(name = "ID_SEGMENT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEGMENT_SEQ")
	@SequenceGenerator(name = "SEGMENT_SEQ", sequenceName = "SEGMENT_SEQ", allocationSize = 1)
	public int getId_segment() {
		return id_segment;
	}

	public void setId_segment(int id_segment) {
		this.id_segment = id_segment;
	}

	@Column(name = "NAME")
	@NotNull(message = "NAME é obrigatório")
	@Size(min = 2, max = 50, message = "NAME deve estar entre 2 e 50 caracteres")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}