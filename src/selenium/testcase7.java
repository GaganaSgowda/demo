package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");
		//driver.findElement(By.xpath("//img[@alt='Integrated platform for SMEs for e-commerce, enquiries and financing']")).click();
		driver.findElement(By.xpath("//span[text()='Ask Help']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("gagana");
		driver.findElement(By.xpath("//input[@name='entityName']")).sendKeys("gaanu");
		driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("7338558254");
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("jsgagana39@gmail.com");
		driver.findElement(By.xpath("//select[@name='helpRequest.issueSourceDesc']")).click();
		driver.findElement(By.xpath("//textarea[@name='issueDesc']")).sendKeys("hii my name is gagana");
		driver.findElement(By.xpath("//span[@aria-checked='false']")).click();
		
		
	}
	//span[@aria-checked='false']//span[@aria-checked='false']
}
