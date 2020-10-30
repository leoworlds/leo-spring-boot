package leo.main.dao;

import leo.main.model.User;

public class UserDao {

	public User getUserById(Integer id) {
		
		var user = new User();
		user.setId(id);
		user.setName("Leopardo");
		
		return user;
	}
	
}
