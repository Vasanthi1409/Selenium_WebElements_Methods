package webElements_Methods.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods {

	public static void main(String[] args) {
		
		WebDriver D = new ChromeDriver();
		D.get("https://accounts.google.com/");
		D.manage().window().maximize();
		WebElement email = D.findElement(By.name("identifier"));
		email.sendKeys("harishvasanthi1409@gmail.com");
		WebElement Nextbutton = D.findElement(By.cssSelector("span[color:'#fff']"));
//		WebElement Nextbutton = D.findElement(By.className("VfPpkd-vQzf8d"));
		Nextbutton.click();
		WebElement pwd = D.findElement(By.name("Passwd"));
		pwd.sendKeys("vasanthiharish");

	}

}
