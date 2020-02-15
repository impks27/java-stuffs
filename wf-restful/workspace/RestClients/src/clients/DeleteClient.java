package clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class DeleteClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/EmpRestService/rest")
				.path("emp").path("delete").queryParam("eid", 102);


		String resp = target.request(MediaType.TEXT_PLAIN)
				.delete(String.class);

		System.out.println(resp);

	}

}
