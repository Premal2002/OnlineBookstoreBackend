package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Email;
import com.example.demo.serviceimpl.EmailService;
import com.google.gson.Gson;

//@CrossOrigin(origins = "http://bookstorefrontend.s3-website.eu-north-1.amazonaws.com")
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://onlinebooksheaven.netlify.app")
@CrossOrigin(origins = {"https://onlinebooksheaven.netlify.app","http://localhost:4200"})
@RestController
public class EmailController {
	@Autowired
	private EmailService emailService;

	@RequestMapping("/api/email/")
	public ResponseEntity<String> checkEmail(@RequestBody Email email) {
		emailService.sendEmail(email.getSetTo(), email.getSetSubject(), email.getSetText());
		Gson gson = new Gson();
		return new ResponseEntity<String>(gson.toJson("Message send"),HttpStatus.OK);
	}
}
