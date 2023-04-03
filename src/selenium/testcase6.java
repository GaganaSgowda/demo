package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@title='Apply for Loan']")).click();
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,900)");
		//driver.findElement(By.xpath("//button[text()=' LOGIN TO APPLY ']")).click();
		driver.findElement(By.xpath("//button[@class='btn downloadButton float-left my-4']")).click();
	}

}
