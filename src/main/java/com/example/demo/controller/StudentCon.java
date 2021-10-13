package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Controller

public class StudentCon {
	@Autowired
	StudentRepo con;

	@RequestMapping("/")
	public String home()

	{
		System.out.println("Cheacking");
		return "home.jsp";

	}

	@RequestMapping("/addstudent")
	// data coming from student will be asine to student obj
	public String addStudent(Student student) {

		con.save(student);

		return "home.jsp";
	}
	// data coming from student will be pass to its student obj
		// Request param is to get/fetch the value from client
	@RequestMapping("/getstudent")
	public ModelAndView getStudent(@RequestParam int aid) {

		ModelAndView mv = new ModelAndView("show.jsp");
		Student st = con.findById(aid).orElse(new Student());
		mv.addObject(st);
		return mv;
	}
}

//home page click on sumbit goes to addstudent is just fetching the value of student  and save it con .save and con is refrence of Student REPO That is interface
