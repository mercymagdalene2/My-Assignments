package week2.day1;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mercy");
		driver.findElement(By.name("lastname")).sendKeys("Thomas");
		driver.findElement(By.name("reg_email__")).sendKeys("8015565605");
		driver.findElement(By.id("password_step_input")).sendKeys("Start@123");
		WebElement dropDownD = driver.findElement(By.id("day"));
		Select D = new Select(dropDownD);
		D.selectByValue("2");
		WebElement dropDownM = driver.findElement(By.id("month"));
		Select M = new Select(dropDownM);
		M.selectByVisibleText("Dec");
		WebElement dropdownY = driver.findElement(By.id("year"));
		Select Y = new Select(dropdownY);
		Y.selectByValue("1996");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
