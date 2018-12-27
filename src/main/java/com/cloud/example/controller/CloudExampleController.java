package com.cloud.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudExampleController {
	
	private static Logger logger = LogManager.getLogger(CloudExampleController.class);

	@RequestMapping(value = "/message")
	public String getMessage(@RequestParam("incomeMessage") String message, HttpServletRequest request){
		logger.info("In getMessage method...");
		String returnMessage = "Welcome to Cloud:"+message;
		return returnMessage;
		
	}
}
