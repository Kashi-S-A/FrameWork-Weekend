package com.tyss.sb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping
	public String fetch() {
		String a = null;
		a.charAt(0);
		int b = 10 / 0;
		return "Student is fetched";
	}

	@PostMapping
	public String saveStudent() {
		return "Student is saved";
	}

	@PutMapping
	public String updateStudent() {
		return "Student is updated";
	}

	@DeleteMapping
	public String deleteStudent() {
		return "Student is deleted";
	}

	@PatchMapping
	public String deleteStudents() {
		return "Student is data updated";
	}
}
