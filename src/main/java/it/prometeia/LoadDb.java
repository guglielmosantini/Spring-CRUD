package it.prometeia;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.prometeia.entity.Users;
import it.prometeia.repository.UserRepository;

@Configuration
public class LoadDb {

	private static final Logger log = LoggerFactory.getLogger(LoadDb.class);

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			repository.save(new Users("jack", "Giacomo", "Rossi", "Studente"));
			repository.save(new Users("paolo", "Paolo", "Bianco", "Impiegato"));
			repository.save(new Users("fulv", "Fulvio", "Verdi", "Developer"));
			repository.save(new Users("X", "Francesco", "Neri", "Disoccupato"));

			log.info("USERS findall():");
			for (Users users : repository.findAll()) {
				log.info(users.toString());
			}
			log.info("------------------");
/*
			// fetch individual User by ID
			Optional<Users> users = repository.findById(1L);
			log.info("User found with findById(1L):");
			log.info(users.toString());

			log.info("USERS DELETE()");
			repository.deleteById(1L);
			for (Users userss : repository.findAll()) {
				log.info(userss.toString());
			}
			log.info("------------------");*/

		};

	}
}
