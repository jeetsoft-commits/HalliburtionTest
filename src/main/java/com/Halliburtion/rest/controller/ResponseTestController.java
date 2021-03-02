package com.Halliburtion.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseTestController {

	@GetMapping(value = "/getStatus" , produces = "application/json")
	public ResponseEntity<String> getStatusCode(){
	    String msg= "The Response Status is ::" + HttpStatus.OK;
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@PostMapping(value = "/calc" , produces = {"application/json" , "application/xml"})
	public ResponseEntity<Integer> total(@RequestParam("inputNum") Integer inputNum){
		Integer addition= inputNum + 5;
		
		return new ResponseEntity<Integer>(addition,HttpStatus.OK);
	}
}
