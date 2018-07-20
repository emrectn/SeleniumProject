import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.out.println("Facebook");
		
		// Create Driver object for chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emre.cetin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.className("inputtext")).sendKeys("hello");
		driver.findElement(By.name("session[username_or_email]")).sendKeys("ofkbot");
		driver.findElement(By.name("session[password]")).sendKeys("123123123");
		
		/*
		driver.findElement(By.id("email")).sendKeys("emrec.tin@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.id("u_0_2")).click(); 
		*/


	}
}
