package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thomas");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mercy");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mary");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mercymagdalene@gmail.com");
	WebElement dropDownSP = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select sec = new Select(dropDownSP);
	sec.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
	
	
	
	 
}
}
