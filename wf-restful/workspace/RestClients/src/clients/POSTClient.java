package clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class POSTClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/EmpRestService/rest")
				.path("emp").path("save");

		Form form = new Form();
		form.param("id", "108");
		form.param("name", "Chandra");
		form.param("loc", "Hyderabad");
		form.param("salary", "40000");

		String resp = target.request(MediaType.TEXT_PLAIN)
				.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED),String.class);

		System.out.println(resp);

	}

}
