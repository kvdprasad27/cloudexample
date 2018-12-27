package com.cloud.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.example.controller.helper.HoroscopeControllerHelper;

@RestController
public class HoroscopeController {
	
	private static Logger logger = LogManager.getLogger(HoroscopeController.class);
	
	
	@RequestMapping(value = "/dob")
	public String getYourSign(@RequestParam("dob") String dateOfBirth, HttpServletRequest request){
		logger.info("In getYourSign method...");
		String yourSign = HoroscopeControllerHelper.getYourSign(dateOfBirth);
		String signDescription = HoroscopeControllerHelper.getSignDescription(yourSign);
		String returnMessage = HoroscopeControllerHelper.getHtmlString(yourSign, signDescription);
		return returnMessage;
		
	}

}
