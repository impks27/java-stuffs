package com.demo.ws;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Calculator cal= new Calculator();
		Endpoint.publish("http://localhost:8181/WS/cal", cal);
		System.out.println("Web Service Started...");

	}

}
