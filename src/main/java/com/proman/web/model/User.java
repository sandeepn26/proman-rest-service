package com.proman.web.model;

import javax.validation.constraints.Pattern;

import com.proman.web.validator.ValidationConstants;

public class User {

	@Pattern(regexp = ValidationConstants.USERNAME_PATTERN, message = "Username must have letters numbers and special characters - , _ , and @")
    private String username = null;

	@Pattern(regexp = ValidationConstants.USERNAME_PATTERN, message = "invalid password")
	private String password = null;

	@Pattern(regexp = ValidationConstants.USERNAME_PATTERN, message = "invalid password")
    private String retypedpassword = null;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRetypedpassword() {
		return retypedpassword;
	}

	public void setRetypedpassword(String retypedpassword) {
		this.retypedpassword = retypedpassword;
	}

}
