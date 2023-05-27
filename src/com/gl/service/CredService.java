	package com.gl.service;

import com.gl.model.Employee;

public interface CredService {
	String generateEmailId(String firstname,String lastname,String dept);
	String generatePassword();
	void showDetails(Employee e1);
 

}
