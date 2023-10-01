package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
	    //driver.close();//this method is used to close selenium focus tab
	    //driver.quit();//this method is used close current opening tabs
	    
	}

}
