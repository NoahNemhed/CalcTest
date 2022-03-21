package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	


	@RequestMapping(method = RequestMethod.GET, path = "/add/{x},{y}")
		public double add(@PathVariable double x, @PathVariable double y) {
			return x + y;
			
		}
		
	@RequestMapping(method = RequestMethod.GET, path = "/multiply/{x},{y}")
		public double multiply(@PathVariable double x, @PathVariable double y) {
			return x * y;
			
		}
		
	@RequestMapping(method = RequestMethod.GET, path = "/subtract/{x},{y}")
		public double subtract(@PathVariable double x, @PathVariable double y) {
			return x - y;
			
		}
	
	
		
		

	
}
