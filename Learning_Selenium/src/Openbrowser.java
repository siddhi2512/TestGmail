import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        File file = new File("C:\\selenium\\chromedriver.exe");
        
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Software");
		element.submit();
	}

}
