package com.digitals.admin.svc;

import java.util.List;

import com.digitals.admin.model.User;
import com.digitals.admin.request.entities.UserRequest;

public interface AdminService {

	void saveUser(UserRequest productRequest);

	List<User> getAllUsers();

}
