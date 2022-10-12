package com.blitzget.getbodying.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blitzget.getbodying.model.sampleRequest;
import com.blitzget.getbodying.model.sampleResponse;

@RestController
public class helloController {

    @RequestMapping("/hello")
	public sampleResponse Sample(@RequestBody sampleRequest sampleRequest) {
		sampleResponse response = new sampleResponse();
		response.setFirstName(sampleRequest.getFirstName());
		response.setLastName(sampleRequest.getLastName());
        response.setPhone(sampleRequest.getLastName());
		return response;

	}
    
}
