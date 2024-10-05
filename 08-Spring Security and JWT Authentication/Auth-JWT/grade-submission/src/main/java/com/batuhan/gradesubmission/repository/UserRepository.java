package com.batuhan.gradesubmission.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.batuhan.gradesubmission.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	 Optional<User> findByUsername(String username);
	// boolean existsByUsername(String username);
}