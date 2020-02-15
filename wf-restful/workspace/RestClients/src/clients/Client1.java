package clients;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.SslConfigurator;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class Client1 {

	public static void main(String[] args) {
		SslConfigurator sslconfig=SslConfigurator.newInstance();
		sslconfig.trustStoreFile("c:/ssl/mykeys.jks");
		sslconfig.trustStorePassword("welcome1");
		
		SSLContext sslCtx=sslconfig.createSSLContext();
		
		
		Client client = ClientBuilder.newBuilder().hostnameVerifier(new HostnameVerifier() {
			
			@Override
			public boolean verify(String hostname, SSLSession session) {
				// TODO Auto-generated method stub
				return false;
			}
		}).sslContext(sslCtx).build();
		
		HttpAuthenticationFeature auth=HttpAuthenticationFeature.basic("shantanu","welcome1");
		client.register(auth);
		
		WebTarget target = client.target("https://localhost:8443/EmpRestService/rest").path("emp").path("find")
				.path("100");
		
		String resp = target.request(MediaType.APPLICATION_JSON).get(String.class);
		
		System.out.println(resp);
		
	}

}
