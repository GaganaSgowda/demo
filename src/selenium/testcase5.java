package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter product name here...']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter product name here...']")).sendKeys("dressing table");
		driver.findElement(By.xpath("//a[@class='pb-0 buyesearchlist-web']")).click();
	}

}
