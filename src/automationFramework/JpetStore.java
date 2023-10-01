package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JpetStore {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[1]")).sendKeys("FArjan_1");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[2]")).sendKeys("Welcome@01");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[3]")).sendKeys("Welcome@01");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[4]")).sendKeys("FARJANA");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[5]")).sendKeys("B");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[6]")).sendKeys("farjana@gmail.com");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[7]")).sendKeys("6380998558");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[8]")).sendKeys("11");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[9]")).sendKeys("road");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[10]")).sendKeys("erode");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[11]")).sendKeys("tamilnadu");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[12]")).sendKeys("638005");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[13]")).sendKeys("india");
		Select Language = new Select(driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::select[1]")));
		Language.selectByVisibleText("english");
		Select Favore = new Select(driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::select[2]")));
		Favore.selectByVisibleText("FISH");
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[14]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[15]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[16]")).click();
		



		

	}

}
