package qsp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile_LoginToActitime  {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./data/CommonData1.properties");
		Properties p=new Properties();
		p.load(fis);
		String url =p.getProperty("url");
		String un =p.getProperty("username");
		String pw =p.getProperty("password");
		System.out.println(url);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
		
}
}