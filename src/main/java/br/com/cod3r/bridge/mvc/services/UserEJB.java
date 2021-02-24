package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDAO;
import br.com.cod3r.bridge.mvc.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDAO dao) {
		super(dao);
	}

	public void save(User user) {
		super.save(user);
		System.out.println("Starting a save operation through EJB Protocol!");
	}
}
