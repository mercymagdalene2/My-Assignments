package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Thomas");
		driver.findElement(By.id("lastNameField")).sendKeys("Sam");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jeabaraj");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Mercy");
		driver.findElement(By.name("departmentName")).sendKeys("Loan");
		driver.findElement(By.name("description")).sendKeys("Loan Department");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mercymagdalene@gmail.com");
		WebElement dropDownSP = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sec = new Select(dropDownSP);
		sec.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Its Priority");
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		

		

}
}
