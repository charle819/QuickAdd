package org.toolbox.TaskForMe.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.toolbox.TaskForMe.controller.dto.request.UserRequest;
import org.toolbox.TaskForMe.controller.dto.response.UserResponse;
import org.toolbox.TaskForMe.dao.UserDao;
import org.toolbox.TaskForMe.model.User;
import org.toolbox.TaskForMe.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	private UserResponse getUserResponse(User user) {

		if (user == null)
			return null;
		else
			return new UserResponse(user.getT_user_id(), user.getUserName(), user.getFirstName(), user.getLastName(),
					user.getEmail(), user.getContactNo());
	}

	@Override
	public UserResponse getById(int userId) {
		return getUserResponse(userDao.findByUserId(userId));
	}

	
	@Override
	public UserResponse getUserByUserName(String userName) {
		return getUserResponse(userDao.findByUserNameIgnoreCase(userName));
	}

	@Override
	public UserResponse getUserByEmail(String email) {
		return getUserResponse(userDao.findByEmailIgnoreCase(email));
	}

	@Override
	public UserResponse save(UserRequest userRequest) {

		User user = new User();
		user.setEmail(userRequest.getEmail());
		user.setFirstName(userRequest.getFirstName());
		user.setLastName(userRequest.getLastName());
		user.setUserName(userRequest.getUserName());
		user.setContactNo(userRequest.getContactNo());

		return getUserResponse(userDao.save(user));
	}

	@Override
	public UserResponse update(UserRequest userRequest) {
		
		User user = userDao.getOne(userRequest.getT_user_id());
		if(user != null) {
			
			user.setFirstName(userRequest.getFirstName());
			user.setLastName(user.getLastName());
			user.setContactNo(userRequest.getContactNo());
			return  getUserResponse(userDao.save(user));
			
		} else {
			return new UserResponse();
		}
	}


}
