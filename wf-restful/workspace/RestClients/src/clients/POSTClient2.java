package clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.Emp;

public class POSTClient2 {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/EmpRestService/rest")
				.path("emp").path("save-json");

		

		Emp e=new Emp(109, "James", "Hyderabad", 234000);
		
		String resp = target.request(MediaType.TEXT_PLAIN)
				.post(Entity.entity(e, MediaType.APPLICATION_JSON),String.class);

		System.out.println(resp);

	}

}
