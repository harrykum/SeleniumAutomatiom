package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class HeightAndWidthEmailPwd {
	
        static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	 Dimension emailTbx = driver.findElement(By.id("email")).getSize();
	 Dimension passTbx = driver.findElement(By.id("pass")).getSize();
	 
		int height = emailTbx.getHeight();
		int width = emailTbx.getWidth();
		 height = passTbx.getHeight();
		 width = passTbx.getWidth();
		System.out.println("Height="+height);
		System.out.println("Width="+width);
		driver.close();
}
}
