package com.demo.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class EmpNotFoundExceptionMapper implements ExceptionMapper<EmpNotFoundException> {

	@Override
	public Response toResponse(EmpNotFoundException ex) {
		Response resp = Response
				.status(Response.Status.NOT_FOUND)
				.entity(ex.getMessage())
				.build();
		return resp;
	}

}
