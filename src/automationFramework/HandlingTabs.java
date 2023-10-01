package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
	    Thread.sleep(5000);
	    ArrayList <String> Naukritabs=new ArrayList <String>(driver.getWindowHandles());
	    /*for(String WindowsHandleValues:Naukritabs)
	    {
	    	System.out.println(WindowsHandleValues);//1528522019D54DF914E301812EDB7C97
	    	                                        //98F0FF78F7D014B468AE904520B49A85 like emloyee id value
	    }*/
	    driver.switchTo().window(Naukritabs.get(1));
	    String PageTitle=driver.getTitle();
	    System.out.println(PageTitle);//Resume Writing Services - CV - Bio data | Naukri Fastforward
	    String PageUrl=driver.getCurrentUrl();
	    System.out.println(PageUrl);//https://resume.naukri.com/?fftid=100001

	    
	    
	}

}
