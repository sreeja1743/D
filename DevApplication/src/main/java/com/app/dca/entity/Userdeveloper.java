package com.app.dca.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

@Entity
@DiscriminatorColumn(name = "user_mode", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "1")
public class Userdeveloper {
	@Id
	@NotEmpty(message="Id cannot be left empty")
	@Size(min=4,max=50,message="Invalid ID")
	private String userId;
	
	@Column
	@ApiModelProperty(name = "User Password", value = "User Password consists of alphanumeric as well as special characters.")
	@Size(min = 4, max = 15, message = "Please enter a valid User Password, the User Password should be from 4 to 15 characters long.")
	private String password;
	

	@NotEmpty(message="Role of the user cannot be empty")
	@Size(min=3,max=10,message="Invalid role")
	private String role;
	
	public Userdeveloper(String userId2, String password, String role) {
		super();
		this.userId = userId2;
		this.password = password;
		this.role = role;
	}	
	
	public Userdeveloper() {
		super();
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Userdeveloper other = (Userdeveloper) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserD [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}
	
}
