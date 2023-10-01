package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElementsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		driver.manage().window().maximize();
		int LinksCount = driver.findElements(By.tagName("a")).size();
		System.out.println(LinksCount);//2782 by using "linkCount" we can find how many links are persent in the page
		int imagesCount=driver.findElements(By.tagName("img")).size();
		System.out.println(imagesCount);//24 by using "imagesCount" we can find how many Images are persent in the page
			}

}
