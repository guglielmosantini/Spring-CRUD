package it.prometeia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.prometeia.entity.Users;
import it.prometeia.repository.UserRepository;
import it.prometeia.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	@Autowired
	private UserService service;

	
	// Aggregate root
	// tag::get-aggregate-root[]
	@GetMapping("/users")
	 private List<Users> all(){
		//return repository.findAll();
		return service.getUsers();

	}
	
	// end::get-aggregate-root[]
	
	@PostMapping("/users")
	private Users newUser(@RequestBody Users newUser) {
		//return repository.save(newUser);
		return service.salvaUser(newUser);
	}
	
	//single item
	@GetMapping("/users/{id}")
	private Users one(@PathVariable Long id) {
		/*return repository.findById(id)
				.orElseThrow(()-> new UserNotFoundException(id));*/
		Users opt=service.getUserById(id);
		return opt;
		
	}
	
	@PutMapping("users/{id}")
	private Users updateUser(@RequestBody Users newUser, @PathVariable Long id) {
		//Users op= service.getUserById(id);
		//ModelAndView mav= new ModelAndView();
			//mav.addObject("users",op.get());
			newUser= service.salvaUser(newUser);
		return newUser;
	}
	
	@DeleteMapping("/users/{id}")
	private void deleteUser(@PathVariable Long id) {
		service.deleteUser(id);
	}

}
