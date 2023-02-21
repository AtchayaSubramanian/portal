package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController{
  @GetMapping("/")
  public String part()
  {
	  return "Welcome";
  }
  @GetMapping("/List")
  public List<name> getList()
  {
	List<name>detailsList=new ArrayList<>();
	detailsList.add(new name(1,"at",100));
	detailsList.add(new name(2,"ch",200));
	detailsList.add(new name(3,"ay",300));
	return detailsList;
  }
}
