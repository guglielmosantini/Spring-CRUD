package it.prometeia.controller;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(Long id) {
		super("Utente non trovato con id: " +id);
	}

}
