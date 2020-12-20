package com.EmployeePortal.socgen.Entity;

public class Response {
	
	private String responseCode;
	// 0 for successful
	// 1 for failure
	
	private String responseMessage;

	
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
}
