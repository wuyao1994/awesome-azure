package com.aaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class CosmosController {
	@Autowired
	UserService userService;

	@ResponseBody
	@GetMapping("/get/{id}")
	public User getUser(@PathVariable("id") String id) {
		return userService.getUserById(id);
	}

	@ResponseBody
	@PostMapping("/add")
	public User addNewUser(@RequestBody User user) {
		return userService.insertUser(user);
	}

}
