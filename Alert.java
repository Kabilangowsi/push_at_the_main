package qatools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium4.5\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		WebElement findElement = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
		// driver.switchTo().alert().sendKeys("kabilan");
		// driver.switchTo().alert().accept();

	}

}
