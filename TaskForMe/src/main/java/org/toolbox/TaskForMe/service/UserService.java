package org.toolbox.TaskForMe.service;

import org.toolbox.TaskForMe.controller.dto.request.UserRequest;
import org.toolbox.TaskForMe.controller.dto.response.UserResponse;

public interface UserService {

	public UserResponse getById(int userId);
	
	public UserResponse getUserByUserName(String userName);
	
	public UserResponse getUserByEmail(String email);
	
	public UserResponse save(UserRequest userRequest);
	
	public UserResponse update(UserRequest userRequest);
	
}
