package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/upload/");
	    driver.manage().window().maximize();
	    WebElement UploadButton=driver.findElement(By.id("uploadfile_0"));
	    UploadButton.sendKeys("C:\\Users\\AA\\OneDrive\\Pictures\\Screenshots\\Screenshot (1).PNG");
	}

}
