package com.example.demo;

public class CreateClientRequest {
	
	private String name;
	private String communication;
	
	public CreateClientRequest()
	{
		// default constructor CreateClientRequest
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCommunication() {
		return communication;
	}
	public void setCommunication(String communication) {
		this.communication = communication;
	}

}
