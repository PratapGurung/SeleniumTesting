package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(Long Id);

	Optional<User> getUserById(long id);

	List<User> getAllUser();
}