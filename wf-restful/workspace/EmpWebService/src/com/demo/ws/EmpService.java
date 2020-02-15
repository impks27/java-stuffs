package com.demo.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EmpService {

	@WebMethod
	public Emp getEmpDetails(int empId);
	
	@WebMethod(operationName="saveEmp")
	public String save(Emp e);
	
	@WebMethod
	public List<Emp> getEmpList();
}
