package com.demo.rest;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class MainServer {

	public static void main(String[] args) throws Exception {
		URI uri=UriBuilder.fromUri("http://localhost").port(8282).build();
		
		ResourceConfig resource=new ResourceConfig(HrService.class);
		
		HttpServer server=GrizzlyHttpServerFactory.createHttpServer(uri, resource);
		System.in.read();
		
		server.shutdown();
		
	}

}
