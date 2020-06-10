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
@Table(name = "TB_BOT")
public class BotModel {

	private long id_bot;
	private String name;
	private String welcome_msg;
	private String farewell_msg;
	private int downtime;
	private String default_answer;
	private SegmentModel segment;

	public BotModel() {
	}

	public BotModel(long id_bot, String name, String welcome_msg, String farewell_msg, int downtime,
			String default_answer, SegmentModel segment) {
		super();
		this.id_bot = id_bot;
		this.name = name;
		this.welcome_msg = welcome_msg;
		this.farewell_msg = farewell_msg;
		this.downtime = downtime;
		this.default_answer = default_answer;
		this.segment = segment;
	}

	@Id
	@Column(name = "ID_BOT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOT_SEQ")
	@SequenceGenerator(name = "BOT_SEQ", sequenceName = "BOT_SEQ", allocationSize = 1)
	public long getId_bot() {
		return id_bot;
	}

	public void setId_bot(long id_bot) {
		this.id_bot = id_bot;
	}

	@Column(name = "name")
	@NotNull(message = "Nome obrigatório")
	@Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 50 caracteres")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "welcome_msg")
	@NotNull(message = "welcome_msg obrigatório")
	@Size(min = 2, max = 40, message = "welcome_msg deve ser entre 2 e 50 caracteres")
	public String getwelcome_msg() {
		return welcome_msg;
	}

	public void setwelcome_msg(String welcome_msg) {
		this.welcome_msg = welcome_msg;
	}

	@Column(name = "farewell_msg")
	@NotNull(message = "farewell_msg obrigatório")
	@Size(min = 10, max = 400, message = "farewell_msg deve ser entre 10 e 400 caracteres")
	public String getfarewell_msg() {
		return farewell_msg;
	}

	public void setfarewell_msg(String farewell_msg) {
		this.farewell_msg = farewell_msg;
	}

	@Column(name = "downtime")
	@DecimalMin(value = "0.01", message = "downtime deve ser acima de 0.01")
	@NumberFormat(style = Style.CURRENCY)
	public int getdowntime() {
		return downtime;
	}

	public void setdowntime(int downtime) {
		this.downtime = downtime;
	}

	@Column(name = "default_answer")
	@Size(min = 10, max = 400, message = "default_answer deve ser entre 10 e 400 caracteres")
	public String getdefault_answer() {
		return default_answer;
	}

	public void setdefault_answer(String default_answer) {
		this.default_answer = default_answer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SEGMENT", nullable = false)
	public SegmentModel getSegment() {
		return segment;
	}

	public void setSegment(SegmentModel segment) {
		this.segment = segment;
	}
}
