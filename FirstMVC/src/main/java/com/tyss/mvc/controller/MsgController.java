package com.tyss.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MsgController {

	@RequestMapping("/msg")
	public String getMsg() {
		System.out.println("This is msg method");
		return "read.jsp";
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String readData(HttpServletRequest request) {

		String userName = request.getParameter("un");
		String userEmail = request.getParameter("ue");

		System.out.println(userEmail);
		System.out.println(userName);

		return "test.jsp";
	}

	@RequestMapping("/pass")
	public String passData(Model model) {

		model.addAttribute("PersonId", 1122);
		model.addAttribute("PersonName", "Scott");
		model.addAttribute("PersonMobile", 3456789);

		return "display.jsp";
	}

	@RequestMapping("/data")
	public ModelAndView displayData() {

		ModelAndView mv = new ModelAndView("data.jsp");
//		mv.setViewName("data.jsp");
		mv.addObject("name", "Allen");
		mv.addObject("address", "Thane");

		Student student = new Student();
		student.setSid(101);
		student.setName("Tony");
		student.setEmail("tony@gmail.com");
		student.setStd("12th");

		mv.addObject("stud", student);

		return mv;
	}

	@RequestMapping("/ex")
	public String m1() {
//		String s = "hi";
//		s.charAt(3);
		int a = 10 / 0;
		return "test.jsp";
	}

	@ExceptionHandler(StringIndexOutOfBoundsException.class)
	public ModelAndView exceptionHandler(StringIndexOutOfBoundsException exception) {
		ModelAndView mv = new ModelAndView("ex.jsp");
		System.out.println("local exception handler");
		mv.addObject("msg", exception.getMessage());
		return mv;
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView requestMethodName() {

		ModelAndView mv = new ModelAndView("student.jsp");

		Student student = new Student();
		
		mv.addObject("stu", student);
		System.out.println("An empty student object has been sent to student.jsp");
		return mv;
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public ModelAndView requestMethodName(Student student) {
		
		ModelAndView mv = new ModelAndView("data.jsp");

		mv.addObject("stud", student);
		
		return mv;
	}
	

}
