package com.digitals.admin.repositories;

import org.springframework.data.repository.CrudRepository;

import com.digitals.admin.model.User;


public interface UserRepository extends CrudRepository<User, Long> {
}
