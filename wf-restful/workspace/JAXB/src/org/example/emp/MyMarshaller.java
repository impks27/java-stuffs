package org.example.emp;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MyMarshaller {

	public static void main(String[] args) throws Exception {

		JAXBContext ctx = JAXBContext.newInstance("org.example.emp");
		Marshaller m = ctx.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Name name = new Name();
		name.setFirstName("Ravi");
		name.setLastName("Kiran");

		Address address = new Address();
		address.setDoorNo("1-10-122");
		address.setCity("Hyderabad");
		address.setPin(50016);
		
		Emp e = new Emp();
		e.setName(name);
		e.setAddress(address);
		e.setEmpId(1007);
		e.setSalary(90000);
		
		//m.marshal(e, System.out);
		m.marshal(e, new File("emp.xml"));

	}

}
