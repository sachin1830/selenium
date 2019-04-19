package work;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
		{
			System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	    	driver.get("https://google.com");
	        driver.findElement(By.className("gLFyf")).sendKeys("youtube");
	        driver.findElement(By.name("btnK")).submit();
	        driver.findElement(By.className("LC20lb")).click();
	       // driver.findElement(By.className("style-scope")).click();
	    }

	}
}
