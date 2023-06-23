package com.niranjana.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niranjana.model.Users;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class LoginController {

	
	  private final AuthenticationService service;
	


	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> register(@RequestBody   RegisterRequest req) {
		
			return ResponseEntity.ok(service.register(req));
					
	}
		@PostMapping("/authenticate")
		public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody   AuthenticationRequest req) {
			
			
				return ResponseEntity.ok(service.authenticate(req));

					
	}
}
