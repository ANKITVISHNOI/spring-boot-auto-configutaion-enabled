package com.avssoftsol;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MySpringBootApp {

	private static Logger logger = LogManager.getLogger(MySpringBootApp.class);
	
	@RequestMapping("/")
	List<String> studentList(){
		logger.info("In the list method");
		logger.debug("Degging......");
		logger.error("After Error......");
		
		List<String> students = new ArrayList<String>();
		students.add("Ram");
		students.add("Shayam");
		students.add("Mohan");
		students.add("Rohan");
		students.add("Sohan");
		return students;
	}
	/*String home(){
		return "WELCOME TO SPRING BOOT";
	}*/

	/*@RequestMapping("/Student")
	List<String> studentList(){
		List<String> students = new ArrayList<String>();
		students.add("Ram");
		students.add("Shayam");
		students.add("Mohan");
		students.add("Rohan");
		students.add("Sohan");
		return students;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApp.class, args);
	}

}
