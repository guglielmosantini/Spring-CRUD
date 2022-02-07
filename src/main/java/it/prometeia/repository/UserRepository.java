package it.prometeia.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.prometeia.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	//Optional<Users> findById(Long id);
	
	//List<Users> findByUsername(String username);
}
