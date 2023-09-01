package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
		driver.findElement(By.xpath("//a/span[text()='Skybags']")).click();
		driver.findElement(By.xpath("//a/span[text()='American Tourister']")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//li/a[text()='Newest Arrivals']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Unisex Printed School Backpack For Kids, Black (Ironman Marvel)']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()='1,699']")).getText());
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		
	}

}
