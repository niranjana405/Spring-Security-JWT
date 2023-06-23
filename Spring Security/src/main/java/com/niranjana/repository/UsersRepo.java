package com.niranjana.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niranjana.model.Users;



public interface UsersRepo extends JpaRepository<Users, Long>{
	Optional<Users>  findByEmail(String email);

}
