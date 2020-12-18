package com.example.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {
   @NotBlank(message="user name cannot be empty")
    private String username;
   @Size(min=5, max=10, message="password must be between 5-10 characters")
   private String password;
   public LoginData() {
	   System.out.println("user login successfully");
   }
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "LoginData [username=" + username + ", password=" + password + "]";
}
}