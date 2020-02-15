package org.example.emp;

import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class MyUnmarshaller {

	public static void main(String[] args) throws Exception {
		JAXBContext ctx = JAXBContext.newInstance("org.example.emp");
		Unmarshaller um = ctx.createUnmarshaller();

		Emp e = (Emp) um.unmarshal(new FileInputStream("emp.xml"));
		
		System.out.println(e.getName().getFirstName());

	}

}
