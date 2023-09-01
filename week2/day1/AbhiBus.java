package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.linkText("Bus")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[text()='2']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText());
		driver.findElement(By.id("Bustypes4")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='noseats AvailSts ng-binding']")).getText());
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
		System.out.println(driver.findElement(By.id("ticketfare")).getText());
		WebElement BoardingPoint = driver.findElement(By.className("dropdown_custom"));
		Select BP=new Select(BoardingPoint);
		BP.selectByIndex(3);
		WebElement DroppingPoint = driver.findElement(By.className("dropdown_custom"));
		Select DP=new Select(DroppingPoint);
		DP.selectByIndex(4);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		

		
		
			
		
		
	}

}
