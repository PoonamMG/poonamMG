package ddt;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class InsertDataProperties {

	public static void main(String[] args)throws IOException {
		Properties p=new Properties();
		p.setProperty("url, ", "https://demowebshop.tricentis.com");
			p.setProperty("Username","Poonam");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/prop1.properties");
		p.store(fos,"prop1");;
		System.out.println("value is inserted");
		

	}

}