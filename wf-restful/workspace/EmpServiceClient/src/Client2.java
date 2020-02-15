import https.www_w3schools_com.xml.TempConvert;
import https.www_w3schools_com.xml.TempConvertSoap;

public class Client2 {

	public static void main(String[] args) {
		TempConvert service=new TempConvert();
		
		TempConvertSoap port=service.getTempConvertSoap();
		System.out.println(port.celsiusToFahrenheit("37"));

	}

}
