package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    Thread.sleep(10000);//by using scroll to see click button
	    driver.findElement(By.id("confirmButton")).click();
	    Alert abc=driver.switchTo().alert();
	    String Text=abc.getText();
	    System.out.println(Text);
	    Thread.sleep(5000);
	    abc.accept();
	    //abc.dismiss();**else
	    String OutputText=driver.findElement(By.id("confirmResult")).getText();
	    System.out.println(OutputText);
	    
	    
	    
	    
	    
	}

	

}
