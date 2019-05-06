package org.toolbox.TaskForMe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User extends BaseModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_user_id_seq_generator")
	@SequenceGenerator(name = "t_user_id_seq_generator", sequenceName = "t_user_id_seq", allocationSize = 1)
	@Column(nullable = false, columnDefinition = "SERIAL")
	private int t_user_id;

	@Column(columnDefinition = "varchar")
	private String firstName;

	@Column(columnDefinition = "varchar")
	private String lastName;

	@Column(columnDefinition = "varchar")
	private String email;

	@Column(columnDefinition = "varchar")
	private String userName;

	@Column(columnDefinition = "varchar")
	private String password;

	@Column(columnDefinition = "varchar")
	private String contactNo;

	public int getT_user_id() {
		return t_user_id;
	}

	public void setT_user_id(int t_user_id) {
		this.t_user_id = t_user_id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
