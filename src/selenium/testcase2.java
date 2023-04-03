package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()=' Seller Hub ']")).click();
		driver.findElement(By.xpath("//a[text()=' View More']")).click();
		//driver.findElement(By.xpath("//a[@class='float-right viewmore']")).click();
		//a[text()=' View More']
		
	}

}

