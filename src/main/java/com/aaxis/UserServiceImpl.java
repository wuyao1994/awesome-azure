package com.aaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserById(String id) {
		final Mono<User> findByIdMono = userRepository.findById(id);
		final User findByIdUser = findByIdMono.block();
		return findByIdUser;
	}

	@Override
	public User insertUser(User user) {
		final Mono<User> saveUserMono = userRepository.save(user);
		final User savedUser = saveUserMono.block();
		return savedUser;
	}
}
