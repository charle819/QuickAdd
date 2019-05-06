package org.toolbox.TaskForMe.controller.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserRequest implements Serializable{

	@JsonProperty(value = "t_user_id")
	private int t_user_id;

	@JsonProperty(value = "username")
	private String userName;

	@JsonProperty(value = "password")
	private String password;
	
	@JsonProperty(value = "firstname")
	private String firstName;

	@JsonProperty(value = "lastname")
	private String lastName;

	@JsonProperty(value = "email")
	private String email;

	@JsonProperty(value = "contactno")
	private String contactNo;

	public int getT_user_id() {
		return t_user_id;
	}

	public void setT_user_id(int t_user_id) {
		this.t_user_id = t_user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public UserRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public UserRequest(int t_user_id, String userName, String password, String firstName, String lastName, String email,
			String contactNo) {
		super();
		this.t_user_id = t_user_id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
	}
	
}
