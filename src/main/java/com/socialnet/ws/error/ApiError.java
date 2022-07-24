package com.socialnet.ws.error;

import java.util.Date;
import java.util.Map;

import lombok.Data;

@Data
public class ApiError {
	
	private int statusCode;
	
	private String message;
	
	private String path;
	
	private long timestamp= new Date().getTime();
	
	private Map<String, String> validationErrors;

	public ApiError(int statusCode, String message, String path) {
		this.statusCode = statusCode;
		this.message = message;
		this.path = path;
	}
	
	

}
