package org.toolbox.TaskForMe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.toolbox.TaskForMe.controller.dto.request.UserRequest;
import org.toolbox.TaskForMe.controller.dto.response.BaseResponse;
import org.toolbox.TaskForMe.controller.dto.response.UserResponse;
import org.toolbox.TaskForMe.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/status")
	public ResponseEntity<?> getStatus() {
		return new ResponseEntity<>("Api is up and running", HttpStatus.OK);
	}

	@PostMapping(path = "/save")
	public ResponseEntity<?> saveOrUpdateUser(@RequestBody UserRequest userRequest) {
		
		UserResponse userResponse = ( (userRequest.getT_user_id() != 0) ? userService.update(userRequest) : userService.save(userRequest) );
		
		BaseResponse response = new BaseResponse();
		
		if(userResponse == null) {
			response.setStatus(BaseResponse.ERROR);
			response.setMessage("Failed to save/update user, check logs for more info");
			response.setData(userResponse);
		} else {
			response.setStatus(BaseResponse.SUCCESS);
			response.setData(userResponse);
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(path = "{id}")
	public ResponseEntity<?> getByUserId(@PathVariable(name = "id", required = true) int userId) {
		
		UserResponse userResponse = userService.getById(userId);
		return new ResponseEntity<>(userResponse != null ? new BaseResponse(BaseResponse.SUCCESS, "",userResponse) : new BaseResponse(BaseResponse.ERROR, "No user found with id : "+userId), HttpStatus.OK);
	}
}
