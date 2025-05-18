package com.tyss.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ModelAndView catchException(Exception exception) {
		ModelAndView mv = new ModelAndView("ex.jsp");
		System.out.println("Global exception handler");
		mv.addObject("msg", exception.getMessage());
		return mv;
	}
}
