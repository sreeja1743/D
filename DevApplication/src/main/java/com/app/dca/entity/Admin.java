package com.app.dca.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

@Entity
@DiscriminatorValue(value = "2")
public class Admin extends Userdeveloper {
	
	@ApiModelProperty(name = "Admin Name", value = "Admin Name consists of alphabets ")
	@Size(min = 3, max = 15, message = "Please enter a valid name between 3-15 characters!")
	@Pattern(regexp = "[A-z0-9]+", message = "Please enter a valid Admin Name.")
	@Column
	private String adminName;

	public Admin() {
		super();
	}

	public Admin(String userId, String password) {
		super(userId, password, "admin");
	}

	public Admin(String userId, String password, String adminName) {
		super(userId, password, "admin");
		this.adminName = adminName;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
