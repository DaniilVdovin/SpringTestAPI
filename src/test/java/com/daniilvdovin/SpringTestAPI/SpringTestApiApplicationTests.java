package com.daniilvdovin.SpringTestAPI;

import com.daniilvdovin.SpringTestAPI.controllers.UserController;
import com.daniilvdovin.SpringTestAPI.models.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringTestApiApplicationTests {
	@Autowired
	UserController userController;
	@Test
	void contextLoads() {
		assert(userController != null);
	}
	@Test
	void login() {
		String s = userController.PostLogin(new User(0,"name user 1"));
		assert(s.equals("Hello name user 1"));
		System.out.print(s);
	}
	@Test
	void Reg() {
	  String s = userController.PostReg(new User(0,"name user 1"));
	  assert(s.equals("Hello name user 1"));
	  System.out.print(s);
	}

}
