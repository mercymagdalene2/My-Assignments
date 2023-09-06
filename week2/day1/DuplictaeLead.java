package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplictaeLead {
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("mercymagdalene@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String firstname = driver.findElement(By.xpath("//a[text()='Thomas'][1]")).getText();
		System.out.println(firstname);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title=driver.getTitle();
		System.out.println(title);
	    driver.findElement(By.name("submitButton")).click();
		String FN_new = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (firstname.equals(FN_new)) {
			System.out.println("duplicated lead name is same as captured name");
		}
		else {
			System.out.println("Name doesnt match");
		}
			
		driver.close();
	}
			
		
		
	
		
		
		


}

