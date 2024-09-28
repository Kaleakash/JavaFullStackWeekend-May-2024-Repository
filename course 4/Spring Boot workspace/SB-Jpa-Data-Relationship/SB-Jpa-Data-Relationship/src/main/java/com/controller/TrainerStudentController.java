package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Student;
import com.entity.Trainer;
import com.service.StudentService;
import com.service.TrainerService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class TrainerStudentController {

	@Autowired
	TrainerService trainerService;
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String openPage(Model mm, Trainer tt,Student ss) {
		List<Trainer> trainers = trainerService.findAllTrainer();
		List<Student> students = studentService.findAllStudents();
		mm.addAttribute("trainers", trainers);
		mm.addAttribute("trainer", tt);
		mm.addAttribute("students", students);
		mm.addAttribute("student", ss);
		mm.addAttribute("submitButton", "Store Trainer");
		return "index";
	}
	
	
	
	
	
	@RequestMapping(value = "storeOrUpdateTrainer",method = RequestMethod.POST)
	public String storeOrUpdateTrainer(Model mm, Trainer tt, HttpServletRequest req,Student ss) {
		String buttonNameValue = req.getParameter("b1");
		//System.out.println(buttonNameValue);
		String result = "";
		if(buttonNameValue.equals("Store Product")) {
			result = trainerService.storeTrainer(tt);
		}else {
			result = trainerService.updateTrainerTechnology(tt);
		}
		List<Trainer> trainers = trainerService.findAllTrainer();
		List<Student> students = studentService.findAllStudents();
		tt.setTech("");
		tt.setTid(0);
		tt.setTname("");
		mm.addAttribute("trainers", trainers);
		mm.addAttribute("students", students);
		mm.addAttribute("result", result);
		mm.addAttribute("trainer", tt);
		mm.addAttribute("student", ss);
		mm.addAttribute("submitButton", "Store Trainer");
		return "index";
	}
	
	@RequestMapping(value = "storeStudent",method = RequestMethod.POST)
	public String storeStudent(Model mm, Trainer tt, Student ss) {
		String result = studentService.storeStudent(ss);
		List<Trainer> trainers = trainerService.findAllTrainer();
		List<Student> students = studentService.findAllStudents();
		tt.setTech("");
		tt.setTid(0);
		tt.setTname("");
		ss.setAge(0);
		ss.setSid(0);
		ss.setSname("");
		ss.setTsid(0);
		mm.addAttribute("trainers", trainers);
		mm.addAttribute("students", students);
		mm.addAttribute("result", result);
		mm.addAttribute("trainer", tt);
		mm.addAttribute("student", ss);
		mm.addAttribute("submitButton", "Store Trainer");
		return "index";
	}
	
	
	@RequestMapping(value = "deleteTrainer",method = RequestMethod.GET)
	public String deleteTrainer(Model mm, Trainer tt, @RequestParam("tid") int tid,Student ss) {
		//System.out.println("Delete method called.."+tid);
		String result = trainerService.deleteTrainerDetails(tid);
		List<Trainer> trainers = trainerService.findAllTrainer();
		List<Student> students = studentService.findAllStudents();
		tt.setTid(0);
		mm.addAttribute("result", result);
		mm.addAttribute("trainers", trainers);
		mm.addAttribute("students", students);
		mm.addAttribute("trainer", tt);
		mm.addAttribute("student", ss);
		mm.addAttribute("submitButton", "Store Trainer");
		return "index";
	}
	
	
	@RequestMapping(value = "findTrainer",method = RequestMethod.GET)
	public String findTrainerById(Model mm, Trainer tt, @RequestParam("tid") int tid,Student ss) {
		//System.out.println("Delete method called.."+tid);
		tt = trainerService.findTrainerById(tid);	// tt hold trainer details retrieve from db. 
		List<Trainer> trainers = trainerService.findAllTrainer();
		List<Student> students = studentService.findAllStudents();
		mm.addAttribute("trainers", trainers);
		mm.addAttribute("students", students);
		mm.addAttribute("trainer", tt);		// tt hold trainer record retrieve from db. 
		mm.addAttribute("student", ss);
		mm.addAttribute("submitButton", "Update Trainer");
		return "index";
	}
}


