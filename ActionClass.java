package myFirstpgm;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selelium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2s");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("fruits"));
		
		Select select = new Select(element);
		
		select.selectByVisibleText("Apple");
		Thread.sleep(5000);
		driver.close();
	}

}
