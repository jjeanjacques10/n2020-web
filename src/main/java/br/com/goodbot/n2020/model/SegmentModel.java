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
@Table(name = "SEGMENTS")
public class SegmentModel {

	private int id;
	private String name;

	public SegmentModel() {
	}

	public SegmentModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEGMENT_SEQ")
	@SequenceGenerator(name = "SEGMENT_SEQ", sequenceName = "SEGMENT_SEQ", allocationSize = 1)
	public int getId_segment() {
		return id;
	}

	public void setId_segment(int id) {
		this.id = id;
	}

	@Column(name = "NAME")
	@NotNull(message = "O nome � obrigat�rio")
	@Size(min = 2, max = 50, message = "O nome deve estar entre 2 e 50 caracteres")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}