package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='All India ']")).click();
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();

	}

}
