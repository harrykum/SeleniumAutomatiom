package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\jspider\\selenium sandeep sir\\Automation\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
