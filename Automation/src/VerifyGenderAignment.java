package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class VerifyGenderAignment {
	
		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		int x = driver.findElement(By.name("pwd")).getLocation().getX();
		if(y1==y2&&y2==y3) {
			System.out.println("gender radio button are properly aligned");
		}
		else {
			System.out.println("gender radio button are not properly aligned");
		}
		driver.close();
}
}

