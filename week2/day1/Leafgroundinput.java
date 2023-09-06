package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafgroundinput {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get( "https://www.leafground.com/input.xhtml");
		driver.findElement(By.name("j_idt88:name")).sendKeys("Thomas");
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("Mumbai");
		driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("mercymagdalene@gmail.com");
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys(Keys.TAB);
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("Iam working in Expleo");
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div[@class='ql-editor ql-blank']")).sendKeys("Enter any text");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("j_idt106:thisform:j_idt110")).getText());
		driver.findElement(By.id("j_idt106:float-input")).click();
		System.out.println(driver.findElement(By.id("j_idt106:float-input")).getLocation());
        driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("Thomas");
        WebElement s=driver.findElement(By.id("j_idt106:auto-complete_input"));
        Select S1= new Select (s);
        S1.selectByVisibleText("Thomas3");
         driver.findElement(By.id("j_idt106:j_idt122")).click();
		driver.findElement(By.id("j_idt106:j_idt124")).sendKeys("Enter any text");
		
		
		
	}

}
