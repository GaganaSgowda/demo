package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class regtestcase9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		//span[text()='Building & Construction']
		//driver.findElement(By.xpath("//span[text()='Building & Construction']")).click();
		//driver.findElement(By.xpath("//a[text()='Aggregates']")).click();
		//driver.findElement(By.xpath("//img[@alt='Side Panel']")).click();
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,600)");
		//WebElement els = driver.findElement(By.xpath("//input[@name='pickupPinCode']"));
		//els.sendKeys("5123");
		//driver.findElement(By.xpath("//a[text()='Upgrade to a Membership Plan ']")).click();
		//driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		driver.findElement(By.xpath("//span[text()=' Seller Hub ']")).click();
		driver.findElement(By.xpath("//a[text()='Upgrade to a Membership Plan ']")).click();
	}

}
