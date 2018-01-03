package com.example.demo;

import javax.validation.Valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping(value = "/available/{availableId}", method = RequestMethod.GET)
	  public String available(@PathVariable Long availableId) {
	    return "Spring in Action" + availableId;
	  }
	  @RequestMapping(value = "/checked-out")
	  public String checkedOut() {
	    return "Spring Boot in Action";
	  }
	  
	  @RequestMapping(value = "/clients", method = RequestMethod.POST)
		public String createClient(@Valid @RequestBody CreateClientRequest restRequest) {
		  return "POST " + restRequest.getName();
	  }
	  
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
