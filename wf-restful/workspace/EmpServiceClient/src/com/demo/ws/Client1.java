package com.demo.ws;

import javax.xml.ws.BindingProvider;

public class Client1 {

	public static void main(String[] args) {
	
		EmpServiceImplService service=new EmpServiceImplService();
		
		EmpService port=service.getEmpServiceImplPort();
		
		BindingProvider bp=(BindingProvider)port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8090/WS/empservice");
		
		Emp e1=port.getEmpDetails(100);
		
		System.out.println(e1.getEmpId()+" "+e1.getName()+" "+e1.getSalary());

	}

}
