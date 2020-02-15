package com.demo.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.ws.EmpService")
public class EmpServiceImpl implements EmpService {

	static HashMap<Integer, Emp> empDb = new HashMap<>();

	public EmpServiceImpl() {
		empDb.put(100, new Emp(100, "Karan", "Mumbai", 60000));
		empDb.put(101, new Emp(101, "Raju", "Chennai", 70000));
		empDb.put(102, new Emp(102, "Amith", "Mumbai", 60000));
		empDb.put(103, new Emp(103, "Kiran", "Mumbai", 70000));
		empDb.put(104, new Emp(104, "Shankar", "Bangalore", 80000));
		empDb.put(105, new Emp(105, "Bobby", "Hyderabad", 30000));
		empDb.put(106, new Emp(106, "Charan", "Mumbai", 50000));
	}

	@Override
	public Emp getEmpDetails(int empId) {

		if (empDb.containsKey(empId)) {
			return empDb.get(empId);
		}
		return new Emp();
	}

	@Override
	public String save(Emp e) {
		if (empDb.containsKey(e.getEmpId())) {
			return "Emp Already Exists";
		} else {
			empDb.put(e.getEmpId(), e);
			return "Emp Saved..";
		}
	}

	@Override
	public List<Emp> getEmpList() {
		// TODO Auto-generated method stub
		return new ArrayList<Emp>(empDb.values());
	}

}
