package com.nura.textiles.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nura.textiles.dto.UserDTO;
import com.nura.textiles.utils.ServiceResponse;
import com.nura.textiles.utils.ServiceResponseWrapper;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

	@PostMapping(path = "/login")
	public ResponseEntity<ServiceResponse<String>> login(@RequestParam String username, @RequestParam String password) {
		if (username.equalsIgnoreCase("arun") && password.equalsIgnoreCase("arun")) {
			return ResponseEntity.ok(new ServiceResponseWrapper<String>().wrapServiceResponse("", "ValidUser", 200));
		}

		return ResponseEntity.ok(new ServiceResponseWrapper<String>().wrapServiceResponse(null, "Not available", 404));
	}

	@PostMapping(path = "/register")
	public ResponseEntity<ServiceResponse<?>> register(@RequestBody UserDTO userDTO) {
		return null;
	}
}
