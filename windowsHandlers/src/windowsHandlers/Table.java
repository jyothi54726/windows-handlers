package windowsHandlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("url");
		int row=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		int rowcol=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(rowcol);
		String data1=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(data1);
		for(int i=1;i<=row;i++) {
			String data=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(data);
		}
		driver.close();
	}
}
