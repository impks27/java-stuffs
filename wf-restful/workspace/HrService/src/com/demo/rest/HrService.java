package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hr")
public class HrService {

	@Path("get")
	@Produces("application/json")
	@GET
	public Response getEmp(@QueryParam("id")int id) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/EmpRestService/rest").path("emp").path("find")
				.path(""+id+"");
		
		Response resp = target.request(MediaType.APPLICATION_JSON).get();
		return resp;
	}
	
	@Path("listEmps")
	@Produces("application/json")
	@GET
	public Response getEmpList() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/EmpRestService/rest").path("emp").path("list");
		
		Response resp = target.request(MediaType.APPLICATION_JSON).get();
		return resp;
	}
}
