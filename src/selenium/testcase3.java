package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");
		driver.findElement(By.xpath("//a[@title='About Us']")).click();
	}

}
