package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class mc {
@GetMapping("/cheek")
public String chee () throws JsonProcessingException 
{
	Api res=new Api("ananyaa bow");
	ObjectMapper on=new ObjectMapper();
	return on.writeValueAsString(res);
}
}
