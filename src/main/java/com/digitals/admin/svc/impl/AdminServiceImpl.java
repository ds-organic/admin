package com.digitals.admin.svc.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digitals.admin.model.User;
import com.digitals.admin.repositories.UserRepository;
import com.digitals.admin.request.entities.UserRequest;
import com.digitals.admin.svc.AdminService;

@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void saveUser(UserRequest productRequest) {
		User product = new User();
		product.setId(productRequest.getId());
		product.setName(productRequest.getName());
		product.setOrganization(productRequest.getOrganization());
		userRepository.save(product);
	}

	@Override
	public List<User> getAllUsers() {
		 List<User> users = new ArrayList<>();
		 userRepository.findAll().forEach(users::add);
	        return users;
	}

}
