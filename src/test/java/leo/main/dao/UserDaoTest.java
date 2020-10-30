package leo.main.dao;
	
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import leo.main.model.User;

@SpringBootTest
public class UserDaoTest {

	private static Integer USER_ID = 101;
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void getUserById() {
		assertNotNull(userDao);
		
		User user = userDao.getUserById(USER_ID);
		
		assertNotNull(user);
		assertEquals(user.getId(), USER_ID);
	}
	
}
