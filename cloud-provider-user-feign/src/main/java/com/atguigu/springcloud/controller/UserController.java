package com.atguigu.springcloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.bean.User;
import com.atguigu.springcloud.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/buyMovie/{userId}/{movieId}")
	public Map<String,Object> buyMovie(@PathVariable("userId")Integer userId,@PathVariable("movieId")Integer movieId) {
		
		Map<String,Object> map = new HashMap<>();
		
		User user = userService.getUserById(userId);
		Movie movie = null;
		map.put("user", user);
		map.put("movie", movie);
		return map;
	}
	
}
