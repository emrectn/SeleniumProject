import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	public static void main(String[] args) {
		System.out.println("Twitter");
		
		// Create Driver object for chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emre.cetin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id='doc']/div/div[1]/div[1]/div[2]/div[2]/div/a[2]")).click();
		
		try {
			
			driver.findElement(By.className("js-username-field")).sendKeys("ofkbot");
			driver.findElement(By.className("js-password-field")).sendKeys("123123123");
			driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/div[2]/button")).click();
			//Thread.sleep(3000);
			
			// after login, composing a tweet
//			driver.findElement(By.name("tweet")).sendKeys("Selenium 8th video recording at:  " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
//			driver.findElement(By.className("js-tweet-btn")).click();
//			Thread.sleep(3000);
			
			WebElement sortList = driver.findElement(By.id("global-actions"));
			List<WebElement> navbarList = sortList.findElements(By.tagName("li"));
			
			WebElement homeElement = navbarList.get(0);
			
			for (WebElement element: navbarList) {
				element.click();
				Thread.sleep(1000);
			}
			
			driver.findElement(By.className("DMInboxItem")).click();
			
			JavascriptExecutor jse =(JavascriptExecutor) driver;
			
			// Tweetter Dm Atılması
			jse.executeScript("document.querySelector(\"#tweet-box-dm-conversation > div\").innerHTML  = \"Selenium ile Dm ve Tweet Atabiliyorum Time : " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())+ "\"");
			driver.findElement(By.cssSelector("#tweet-box-dm-conversation > div")).getAttribute("innerHTML");
			Thread.sleep(1000);
			driver.findElement(By.className("tweet-action")).click();
			
			//Gereksiz Tweetlerin Silinmesi
			homeElement.click();
			
		}
		catch (Exception ex) {
			System.out.println("Error : " + ex.toString());
		}
	}
}




