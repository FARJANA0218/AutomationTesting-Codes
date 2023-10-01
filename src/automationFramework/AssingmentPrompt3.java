package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentPrompt3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    Thread.sleep(10000);//by using scroll to see click button
	    driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
	    Alert abc=driver.switchTo().alert();
	    String text=abc.getText();
	    System.out.println(text);
	    abc.sendKeys("Farjana");//Please enter your name
	    abc.accept();
	    String OutputText=driver.findElement(By.id("demo1")).getText();
	    System.out.println(OutputText);//Hello Farjana How are you today


	}

}
