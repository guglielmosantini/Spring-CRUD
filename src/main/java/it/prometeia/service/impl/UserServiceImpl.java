package it.prometeia.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prometeia.entity.Users;
import it.prometeia.repository.UserRepository;
import it.prometeia.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public Users getUserById(long id) {
		// TODO Auto-generated method stub
		Optional<Users> opt= repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	@Override
	public Users salvaUser(Users users) {
		return repo.save(users);
		
	}

	@Override
	public boolean deleteUser(long id) {
		Users p=getUserById(id);
		if (p!=null) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
		}

	

	

	

}
