package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userservice;

	@GetMapping("add_user")
	public String getUserForm() {
		return "addUser";
	}

	@PostMapping("save_user")
	public String saveUser(@ModelAttribute User user) {
		userservice.saveUser(user);
		return "redirect:/list_user";
	}

	@GetMapping("list_user")
	public String getAllUser(Model model) {
		model.addAttribute("users", userservice.getAllUser());
		return "listUser";
	}
}
