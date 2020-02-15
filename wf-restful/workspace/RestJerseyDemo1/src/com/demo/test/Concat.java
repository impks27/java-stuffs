package com.demo.test;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/service")
public class Concat {

	@GET
	@Path("concat")
	@Produces("text/plain")
	public String doConcat(
			@MatrixParam("s1") String s1, 
			@MatrixParam("s2") String s2, 
			@MatrixParam("s3") String s3) {
		return s1 + " " + s2 + " " + s3;
	}
}
