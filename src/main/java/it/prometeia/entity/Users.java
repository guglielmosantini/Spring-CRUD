package it.prometeia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 
	 private String username;
	 private String nome;
	 private String cognome;
	 private String ruolo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public Users(String username, String nome, String cognome, String ruolo) {
		super();
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
	}
	public Users(Long id, String username, String nome, String cognome, String ruolo) {
		super();
		this.id = id;
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", nome=" + nome + ", cognome=" + cognome + ", ruolo="
				+ ruolo + "]";
	}
	
	
	
	
	 
	 
	 
	
}
