package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://lntsufin.com/");

	}

}
