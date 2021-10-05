package com.mdu005.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("student")
public class StudentServices {

	@Path("std1")
	@GET
	public String studentsInfo()
	{
		return "Student Service";
	}
}
