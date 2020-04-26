package com.cenfotec.examen.guid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen.guid.service.GuidServiceImpl;

@RestController
@RequestMapping("/api/guids")
public class GuidController {

	@Autowired
	GuidServiceImpl service;
	
	@GetMapping
	public ResponseEntity<String> get(){
		return ResponseEntity.ok(service.generateGUID());
		
	}
}
