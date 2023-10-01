package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Formy {
	WebDriver driver;

	@Test
	public void a_webBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
	}
	@Test
	public void b_datasTextField()
	{
	
		driver.findElement(By.id("first-name")).sendKeys("Ganesh");
		driver.findElement(By.id("last-name")).sendKeys("Gams");
		driver.findElement(By.id("job-title")).sendKeys("Unemployed");
		
	}
	@Test
	public void c_radioButton() {
		driver.findElement(By.id("radio-button-2")).click();
		//WebElement CollegeRadioButton = driver.findElement(By.id("radio-button-2"));
		//CollegeRadioButton.click();
		//driver.findElement(By.id("checkbox-3")).click();
		WebElement Gender = driver.findElement(By.id("checkbox-3"));
		Gender.click();
	}
	@Test
	public void d_selectArea() {
		Select experience = new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("5-9");
		    //experience.selectByIndex(3);
		//experience.selectByValue("3");
		driver.findElement(By.id("datepicker")).sendKeys("05/21/1997");
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
	}

		
		
	}

	


