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
public class ProdutoModel {

	private int id_segment;
	private String name;
	private String sku;
	private String descricao;
	private BigDecimal preco;
	private String caracteristicas;
	private CategoriaModel categoria;
	private MarcaModel marca;

	public ProdutoModel() {
	}

	public ProdutoModel(int id_segment, String name, String sku, String descricao, BigDecimal preco, String caracteristicas,
			CategoriaModel categoria, MarcaModel marca) {
		super();
		this.id_segment = id_segment;
		this.name = name;
		this.sku = sku;
		this.descricao = descricao;
		this.preco = preco;
		this.caracteristicas = caracteristicas;
		this.categoria = categoria;
		this.marca = marca;
	}

	@Id
	@Column(name = "ID_SEGMENT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEGMENT_SEQ")
	@SequenceGenerator(name = "SEGMENT_SEQ", sequenceName = "SEGMENT_SEQ", allocationSize = 1)
	public int getId_segment() {
		return id_segmentid_segment;
	}

	public void setId_segment(int id_segment) {
		this.id_segment = id_segment;
	}

	@Column(name = "NAME")
	@NotNull(message = "NAME obrigatório")
	@Size(min = 2, max = 50, message = "NAME deve ser entre 2 e 50 caracteres")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
    }