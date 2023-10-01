package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);   //"Zero - Personal Banking - Loans - Credit Cards"
		driver.findElement(By.id("signin_button")).click();
		String loginpageURL=driver.getCurrentUrl();//it print current URL page
		System.out.println(loginpageURL);   //"http://zero.webappsecurity.com/login.html"
		String FrogetPasswordURL=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getText();
		System.out.println(FrogetPasswordURL);    //"Forgot your password ?"
		String Heading =driver.findElement(By.xpath("//a[contains(text(),'Log')]")).getText();
		System.out.println(Heading);
		String Tagname=driver.findElement(By.name("submit")).getTagName();
		System.out.println(Tagname);
		String Attribute=driver.findElement(By.name("submit")).getAttribute("tabindex");
		System.out.println(Attribute);
		String signButton=driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(signButton);
		
		
		
		
		
		
	
	}

}
