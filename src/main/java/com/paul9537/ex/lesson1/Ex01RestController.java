package com.paul9537.ex.lesson1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paul9537.ex.lesson1.model.Person;

@RestController // @Controller + @ResponseBody
@RequestMapping("/lesson1/ex01")
public class Ex01RestController {
	
	@RequestMapping("/3")
	public String printString() {
		return "@RestController 테스트";
	}
	

	@RequestMapping("/4")
	public Person printPerson() {
		Person person = new Person();
		person.setName("김인규");
		person.setAge(28);
		
		return person;
	}
	
	@RequestMapping("/5")
	public ResponseEntity<Person> entity() {
		Person person = new Person();
		person.setName("김인규");
		person.setAge(28);
		
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
}