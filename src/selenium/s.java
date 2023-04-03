package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\DEMO\\server1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='cart-icon']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7338578253");
		//driver.findElement(By.xpath("//button[@id='next']")).click();
		
		//input[@id='phoneNumber']

	}

}
