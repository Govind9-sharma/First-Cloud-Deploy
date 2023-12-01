package com.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jdbc.entity.User;

public interface Repository extends JpaRepository<User,String>{

}
