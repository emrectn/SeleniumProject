import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskManagerOtomation {

	public static void main(String[] args) {
		
		System.out.println("Task Manager Otomation");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emre.cetin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("http://localhost:8080/admin");
			Thread.sleep(3000);

			driver.get("http://localhost:8080/");
			Thread.sleep(3000);
			
			if(driver.getCurrentUrl().equals("http://localhost:8080/login")) {
				
				driver.findElement(By.id("inputEmail")).sendKeys("q");
				Thread.sleep(1000);
				driver.findElement(By.id("inputPassword")).sendKeys("q");
				Thread.sleep(1000);
				driver.findElement(By.className("btn-primary")).click();
				
			}

			// Definiation List
//			List<WebElement> defList = driver.findElements(By.className("text-limit"));
//			
//			for (WebElement element: defList) {
//				element.click();
//				Thread.sleep(4000);
//			}
			
			// Menu List
			WebElement navBar = driver.findElement(By.className("navbar-nav"));
			List<WebElement> navBarList = navBar.findElements(By.tagName("li"));
			
			int counter = 0;
			for(WebElement navbarElement : navBarList) {
				navbarElement.click();
				Thread.sleep(4000);
				
				if (counter == 1) {
					driver.findElement(By.id("tag")).sendKeys("Turkcell");
					Thread.sleep(1000);
					driver.findElement(By.id("type")).sendKeys("A01");
					Thread.sleep(1000);
					driver.findElement(By.id("value")).sendKeys("FTID001");
					Thread.sleep(1000);
					driver.findElement(By.id("is_Active")).sendKeys("TASK01");
					Thread.sleep(1000);
					driver.findElement(By.id("app_name")).sendKeys("AppName");
					
					Select dropdown = new Select(driver.findElement(By.id("selected_costtype")));
					dropdown.selectByIndex(1);
					
					dropdown = new Select(driver.findElement(By.id("selected_hour")));
					dropdown.selectByIndex(1);
					
					dropdown = new Select(driver.findElement(By.id("selected_teamname")));
					dropdown.selectByIndex(1);

					dropdown = new Select(driver.findElement(By.id("selected_status")));
					dropdown.selectByIndex(1);
					
				}
				else if (counter == 2) {
					
				}
				else if (counter == 3) {
					
				}
				else {
					System.out.println("Menude Hata Oluştu");
				}
				counter += 1;
				Thread.sleep(4000);
			}
			
			
			
			
		}
		catch (Exception e) {
			System.out.println("Error : " + e.toString());
		}
	}
}
