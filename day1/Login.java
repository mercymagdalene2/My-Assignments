package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
						driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
								driver.findElement(By.xpath("//a[contains(text(),'CRM')")).click();
								driver.findElement(By.xpath("//a[text()='Leads']")).click();
		}

}


