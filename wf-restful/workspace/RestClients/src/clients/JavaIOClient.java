package clients;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class JavaIOClient {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://localhost:8080/EmpRestService/rest/emp/find/104");
		
		URLConnection con=url.openConnection();
		
		InputStream is=con.getInputStream();
		int b=0;
		while((b=is.read())!=-1) {
			System.out.print((char)b);
		}
		
		System.out.println();
		HttpURLConnection con1=(HttpURLConnection)url.openConnection();
		
		
		con1.setRequestProperty("Accept", "application/json");
		
		InputStream is1=con1.getInputStream();
		int b1=0;
		while((b1=is1.read())!=-1) {
			System.out.print((char)b1);
		}

	}

}
