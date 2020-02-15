package com.demo.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/emp")
public class EmpRestService {

	static HashMap<Integer, Emp> empDb = new HashMap<>();

	public EmpRestService() {
		empDb.put(100, new Emp(100, "Karan", "Mumbai", 60000));
		empDb.put(101, new Emp(101, "Raju", "Chennai", 70000));
		empDb.put(102, new Emp(102, "Amith", "Mumbai", 60000));
		empDb.put(103, new Emp(103, "Kiran", "Mumbai", 70000));
		empDb.put(104, new Emp(104, "Shankar", "Bangalore", 80000));
		empDb.put(105, new Emp(105, "Bobby", "Hyderabad", 30000));
		empDb.put(106, new Emp(106, "Charan", "Mumbai", 50000));
	}

	@Path("/find/{id}")
	@GET
	@Produces({MediaType.APPLICATION_XML,"application/json"})
	public Response getEmpDetails(@PathParam("id")int id) throws EmpNotFoundException{
		if (empDb.containsKey(id)) {
			return Response.ok(empDb.get(id)).build();
		} else {
			throw new EmpNotFoundException("Emp with id "+id+" Not Found");
		}
	}
	
	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public Response save(
			@FormParam("id")int id, 
			@FormParam("name")String name,
			@FormParam("loc")String location,
			@FormParam("salary")double salary) {
		if(empDb.containsKey(id)) {
			return Response.ok("Emp Already Exists").build();
		}else {
			empDb.put(id, new Emp(id, name, location, salary));
			return Response.ok("Emp Saved Successfully").build();
		}
	}
	
	@POST
	@Path("/save-json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response saveJson(Emp e) {
		if(empDb.containsKey(e.getEmpId())) {
			return Response.ok("Emp Already Exists").build();
		}else {
			empDb.put(e.getEmpId(), e);
			return Response.ok("Emp Saved Successfully").build();
		}
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response updateEmp(Emp e) {
		if(empDb.containsKey(e.getEmpId())) {
			empDb.put(e.getEmpId(), e);
			return Response.ok("Existing Emp Updated").build();
		}else {
			empDb.put(e.getEmpId(), e);
			return Response.ok("New Emp Created").build();
		}
	}
	
	@DELETE
	@Path("/delete")
	@Produces(MediaType.TEXT_PLAIN)
	public Response delete(@QueryParam("eid")int id) {
		System.out.println(empDb);
		if(empDb.containsKey(id)) {
			empDb.remove(id);
			return Response.ok("Emp Deleted...").build();
		}else {
			return Response.ok("Emp Does not exist...").build();
		}
	}
	
	@Path("/list")
	@GET
	@Produces({"application/json"})
	public List<Emp> getEmpList(){
		return new ArrayList<Emp>(empDb.values());
	}
}
