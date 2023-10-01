package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
	    driver.findElement(By.id("username")).sendKeys("Ajith0218");
	    driver.findElement(By.name("password")).sendKeys("Farjana");
	    driver.findElement(By.name("repeatedPassword")).sendKeys("7010019779");
	    driver.findElement(By.name("account.firstName")).sendKeys("AjithKumar");
	    driver.findElement(By.name("account.lastName")).sendKeys("Farjana");
	    driver.findElement(By.name("account.email")).sendKeys("ajithfana@love.com");
	    driver.findElement(By.name("account.phone")).sendKeys("7010019779");
	    driver.findElement(By.name("account.address1")).sendKeys("ajithfarjana's House");
	    driver.findElement(By.name("account.address2")).sendKeys("india");
	    driver.findElement(By.name("account.state")).sendKeys("Tamilnadu");
	    driver.findElement(By.name("account.city")).sendKeys("Tamilnadu");
	    driver.findElement(By.name("account.zip")).sendKeys("143");
	    Select Language= new Select(driver.findElement(By.name("account.languagePreferenc")));
	    Language.selectByVisibleText("japanese");
	    WebElement Animal = driver.findElement(By.xpath("//option[@value='CATS']"));
	    Animal.click();
	    WebElement MyList=driver.findElement(By.name("account.listOption"));
	    MyList.click();
	    WebElement MyBanner=driver.findElement(By.name("account.bannerOption"));
	    MyBanner.click();
	    WebElement Submit=driver.findElement(By.name("newAccount"));
	    Submit.click();
	}

}
