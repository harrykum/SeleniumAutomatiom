package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class PrintCheckBox {
	

		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
boolean login=driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
if(login==true) {
	System.out.println("CheckBox is present");
}
else {
	System.out.println("CheckBox is not present");
}
driver.close();
}
	}
