package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationComments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/form");
	    driver.manage().window().maximize();
	    WebElement RadioButton=driver.findElement(By.id("radio-button-2"));
	    RadioButton.click();
	    System.out.println(RadioButton.isEnabled());//true/for radio button verification Recommently use isEnable() but isSelect() is ok
	    WebElement Gender = driver.findElement(By.id("checkbox-3"));
		Gender.click();
		System.out.println(Gender.isSelected());//true/for checkbox verification Recommently use isSelect() but isEnable() is ok
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Complete ')]")).isDisplayed());//true
	}

}
