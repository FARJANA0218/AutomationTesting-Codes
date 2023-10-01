package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    WebElement DoubleClick=driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
	    Actions act=new Actions(driver);
	    act.doubleClick(DoubleClick).build().perform();
	    Alert abc=driver.switchTo().alert();
	    String PopupText=abc.getText();
	    System.out.println(PopupText);//You double clicked me.. Thank You..
	    abc.accept();
	    
	    
	}

}
