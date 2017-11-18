package org.angular.controller;

import org.angular.entity.BlogEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogEntryController {

	@RequestMapping("/test")
	public ResponseEntity<Object> test(){
		BlogEntry entry = new BlogEntry();
		entry.setTitle("Prashant");
		return new ResponseEntity<Object>(entry, HttpStatus.OK);
		
	}
	
}
