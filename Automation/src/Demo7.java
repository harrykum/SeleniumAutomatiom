package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https:www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
