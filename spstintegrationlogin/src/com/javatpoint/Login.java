package com.javatpoint;

public class Login {
private String name,password,successmessage,errormessage;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getSuccessmessage() {
	return successmessage;
}

public void setSuccessmessage(String successmessage) {
	this.successmessage = successmessage;
}

public String getErrormessage() {
	return errormessage;
}

public void setErrormessage(String errormessage) {
	this.errormessage = errormessage;
}

public String execute(){
	if(password.equals("javatpoint")){
		return "success";
	}
	else{
		return "error";
	}
}
}
