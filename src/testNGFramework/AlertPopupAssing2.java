package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopupAssing2 {

	WebDriver driver;
	@Test
	public void a_webdriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	}
	@Test
	public void b_alertFuntion() throws InterruptedException {
	    Thread.sleep(5000);//by using scroll to see click button
	    driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();
	    Alert abc=driver.switchTo().alert();
	    String Text=abc.getText();
	    System.out.println(Text);//Press a Button !
	    Thread.sleep(5000);
	    abc.accept();
	    String OutputText=driver.findElement(By.id("demo")).getText();
	    System.out.println(OutputText);//You pressed Ok
	    //abc.dismiss();**cancel
	    
	    
	}

}
