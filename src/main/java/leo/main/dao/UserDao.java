package leo.main.dao;

import org.springframework.stereotype.Component;

import leo.main.model.User;

@Component
public class UserDao {

	public User getUserById(Integer id) {
		
		User user = new User();
		user.setId(id);
		user.setName("Leopardo");
		
		return user;
	}
	
}
