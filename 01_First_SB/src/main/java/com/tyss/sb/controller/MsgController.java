package com.tyss.sb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/msg")
	public String getPage() {
		System.out.println("Triggered");
		return "used to get";
	}

	@PostMapping("/save")
	public String getMsg() {
		return "Used to save";
	}

	@PutMapping("/update")
	public String update() {
		return "Used to update";
	}

	@DeleteMapping("/delete")
	public String delete() {
		return "Used to delete";
	}
}
