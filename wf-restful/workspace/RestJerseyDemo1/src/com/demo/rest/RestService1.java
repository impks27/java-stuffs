package com.demo.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/demo")
public class RestService1 {

	@GET
	@Path("/greet/{name}")
	public String greet(@PathParam("name")String name) {
		return "Hello, "+name+" Greetings from REST Service";
	}
}
