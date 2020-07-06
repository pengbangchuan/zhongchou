package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.bean.Movie;
import com.atguigu.springcloud.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/getMovieById/{id}")
	public Movie getMovieById(@PathVariable("id") Integer id) {
		System.out.println("port="+port);
		return movieService.getMovieById(id);
	}
}
