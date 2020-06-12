package br.com.goodbot.n2020.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "BOT")
public class BotModel {

	private long id;
	private String name;
	private String welcome_message;
	private String farewell_message;
	private int downtime;
	private String default_answer;

	public BotModel() {

	}

	public BotModel(long id, String name, String welcome_message, String farewell_message, int downtime,
			String default_answer) {
		super();
		this.id = id;
		this.name = name;
		this.welcome_message = welcome_message;
		this.farewell_message = farewell_message;
		this.downtime = downtime;
		this.default_answer = default_answer;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOT_SEQ")
	@SequenceGenerator(name = "BOT_SEQ", sequenceName = "BOT_SEQ", allocationSize = 1)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "NAME")
	@NotNull(message = "Nome obrigat�rio")
	@Size(min = 2, max = 40, message = "O nome deve ser entre 2 e 50 caracteres")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "WELCOME_MESSAGE")
	@NotNull(message = "Welcome Message � obrigat�rio")
	@Size(min = 2, max = 40, message = "O WELCOME_MESSAGE deve ser entre 1 e 100 caracteres")
	public String getWelcome_message() {
		return welcome_message;
	}

	public void setWelcome_message(String welcome_message) {
		this.welcome_message = welcome_message;
	}

	@Column(name = "FAREWELL_MESSAGE")
	@NotNull(message = "FAREWELL Message � obrigat�rio")
	@Size(min = 2, max = 40, message = "O FAREWELL_MESSAGE deve ser entre 1 e 100 caracteres")
	public String getFarewell_message() {
		return farewell_message;
	}

	public void setFarewell_message(String farewell_message) {
		this.farewell_message = farewell_message;
	}

	@Column(name = "DOWNTIME")
	@NotNull(message = "N�o pode ser nulo")
	public int getDowntime() {
		return downtime;
	}

	public void setDowntime(int downtime) {
		this.downtime = downtime;
	}

	@Column(name = "DEFAULT_ANSWER")
	@NotNull(message = "DEFAULT_ANSWER obrigat�rio")
	@Size(min = 2, max = 40, message = "O DEFAULT_ANSWER deve ser entre 2 e 100 caracteres")
	public String getDefault_answer() {
		return default_answer;
	}

	public void setDefault_answer(String default_answer) {
		this.default_answer = default_answer;
	}

}
