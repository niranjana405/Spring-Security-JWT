package com.niranjana.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.niranjana.config.JwtUtil;
import com.niranjana.model.Role;
import com.niranjana.model.Users;
import com.niranjana.repository.UsersRepo;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AuthenticationService  {
	
	
private final UsersRepo userRepo;
private final PasswordEncoder passwordEncoder;
private final JwtUtil jwtUtil;
private final AuthenticationManager authenticationManager;
	
	public AuthenticationResponse register(RegisterRequest req) {
		var user=Users.builder()
				.firstName(req.getFirstname())
				.lastName(req.getLastname())
				.email(req.getEmail())
				.password(passwordEncoder.encode(req.getPassword()))
				.role(Role.USER)
				.build();
		userRepo.save(user);
		System.out.println("REGISTERED");

		var jwtToken=jwtUtil.generateToken(user);
		return AuthenticationResponse.builder().
				token(jwtToken).
				build();
	}

	public AuthenticationResponse authenticate(AuthenticationRequest req) {
		authenticationManager.authenticate(
new UsernamePasswordAuthenticationToken(req.getEmail(), req.getPassword())
				);
		var user=userRepo.findByEmail(req.getEmail()).orElseThrow();
		var jwtToken=jwtUtil.generateToken(user);
System.out.println("AUTHENTICATION");
		return AuthenticationResponse.builder().
				token(jwtToken).
				build();	}
	
	

}
