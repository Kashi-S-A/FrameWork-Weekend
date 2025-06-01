package com.tyss.sb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tyss.sb.util.User;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ReadController {

	// Method : GET , URL :
	// http://localhost:8080/read?id=101&name=Dinga&email=dinga@gmail.com
	@GetMapping("/read")
	public String readQueryString(@RequestParam(name = "id") Integer uid, @RequestParam String name,
			@RequestParam String email) {
		return "uid : " + uid + " , name : " + name + " , email : " + email;
	}

	// Method : GET , URL : http://localhost:8080/r1/uid/101/msg/GoodMorning
	@GetMapping("/r1/uid/{uid}/msg/{msg}")
	public String readDataFromPath(@PathVariable(name = "uid") Integer id, @PathVariable String msg) {
		return "id : " + id + " , msg : " + msg;
	}

	// Method : GET , URL : http://localhost:8080/head (pass data in headers of http
	// request)
	@GetMapping("/head")
	public ResponseEntity<String> readFromHeader(@RequestHeader String token) {
		
		String data = "token : " + token;
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(data, HttpStatus.ACCEPTED);
		
		return responseEntity;
	}

	// Method : POST , URL : http://localhost:8080/body (pass json data in http
	// request)
	@PostMapping("/body")
	public User readDataFromBody(@RequestBody User user) {
		System.out.println(user);
		return user;
	}

	@GetMapping(value = "/body",consumes = {
												"application/json",
												"application/xml"
											},
								produces = {
										"application/json",
										"application/xml"
											}
	)
	public ResponseEntity<User> readDataBody(@Valid @RequestBody User user) {
		System.out.println(user);
		
		ResponseEntity<User> re = new ResponseEntity<User>(user, HttpStatus.CREATED);
		
//		ResponseEntity<User> ok = ResponseEntity.ok(user);
		
		return re;
	}

}
