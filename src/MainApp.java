import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Hello Guys");
		
		// Create Driver object for chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emre.cetin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println("Tittle : " + driver.getTitle());
		System.out.println("URL : " + driver.getCurrentUrl());
		
//		driver.get("https://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("emrec.tin@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("123456");
//		driver.findElement(By.id("u_0_2")).click();
////		driver.findElement(By.linkText("Forgotten account?")).click();
//		
//		
		/* driver.navigate().back();
		 * driver.navigate().forward();
		 * driver.close();
		 * */
		
		 driver.get("https://twitter.com/");
		 driver.findElement(By.className("js-nav EdgeButton EdgeButton--medium EdgeButton--secondary StaticLoggedOutHomePage-buttonLogin")).click();
		// driver.quit();

	}

}
