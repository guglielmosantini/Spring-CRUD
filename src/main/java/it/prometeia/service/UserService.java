package it.prometeia.service;


import java.util.List;
import java.util.Optional;

import it.prometeia.entity.Users;

public interface UserService {
	
	 Users getUserById(long id);
	
	 Users salvaUser(Users users);
	
	 List<Users> getUsers();
	
	 boolean deleteUser(long id);
	

}
