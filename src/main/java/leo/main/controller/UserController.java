package leo.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import leo.main.dao.UserDao;
import leo.main.model.User;

@RestController
public class UserController {

	@GetMapping("user/{userId}")
	public User getUser(UserDao userDao, @PathVariable Integer userId) {
		return userDao.getUserById(userId);
	}
	
}
