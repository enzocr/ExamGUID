package com.cenfotec.examen.guid.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class GuidServiceImpl {

	
	public String generateGUID() {
		return UUID.randomUUID().toString();
	}
	
}
