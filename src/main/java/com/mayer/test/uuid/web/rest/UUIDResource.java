package com.mayer.test.uuid.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UUIDResource {

	private final Logger log = LoggerFactory.getLogger(UUIDResource.class);
	
	@RequestMapping("/uuid")
	public String index() {
		return UUID.randomUUID().toString();
	}

	
}
