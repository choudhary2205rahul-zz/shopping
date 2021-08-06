package com.crazzy.shopping;

import com.crazzy.shopping.config.SecurityUtility;
import com.crazzy.shopping.domain.User;
import com.crazzy.shopping.domain.security.Role;
import com.crazzy.shopping.domain.security.UserRole;
import com.crazzy.shopping.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ShoppingApplication implements CommandLineRunner {

	private final UserService userService;

	public ShoppingApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User user1 = new User();
		user1.setFirstName("Rahul");
		user1.setLastName("Choudhary");
		user1.setUsername("thecrazzyrahul");
		user1.setPhone("9234852314");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("password"));
		user1.setEmail("thecrazzyrahul@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setId(1);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);

		userRoles.clear();

		User user2 = new User();
		user2.setFirstName("Shalu");
		user2.setLastName("Choudhary");
		user2.setUsername("thecrazzyshalu");
		user2.setPhone("8234552314");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("password"));
		user2.setEmail("thecrazzyshalu@gmail.com");
		Role role2 = new Role();
		role2.setId(2);
		role2.setName("ROLE_USER");
		userRoles.add(new UserRole(user2, role2));

		userService.createUser(user2, userRoles);

		userRoles.clear();*/

	}
}
