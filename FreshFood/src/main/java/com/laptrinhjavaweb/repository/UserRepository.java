package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity, Integer>{
	UserEntity findOneByUserNameAndStatus(String name,int status);
}
