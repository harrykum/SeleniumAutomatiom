package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
	
public static void main(String[] args) throws IOException {
		//FileInputStream fis=new FileInputStream("G:\\jspider\\selenium sandeep sir\\31p, 6 jan 2022\\commandata.property.txt");//copy from properties.security
		FileInputStream fis=new FileInputStream("./data/commandata.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String url =p.getProperty("url");
		String un =p.getProperty("username");
		String pwd =p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
	}
}
