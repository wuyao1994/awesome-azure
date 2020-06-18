package com.aaxis;

public interface UserService {
	User getUserById(String id);

	User insertUser(User user);
}
