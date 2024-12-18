package windowsHandlers;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlers {

	public static void main(String[] args) throws Exception{
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///D:/Siri/multiplewindows.html");
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		ArrayList<String> wind=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wind.get(0));
		Thread.sleep(3000);
		driver.quit();
	}
}
