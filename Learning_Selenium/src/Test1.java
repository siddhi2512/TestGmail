import java.io.File;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args)

	{

        File file = new File("C:\\selenium\\chromedriver.exe");
        
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        
    	String pagetitle= driver.getTitle();
    	System.out.println(pagetitle);
    	
    	Set<String> windowslist = driver.getWindowHandles();
    	System.out.println("Another window:"+windowslist);
    	
    	String current_url= driver.getCurrentUrl();
    	System.out.println("Current URL is:"+current_url);
    	driver.close();
     }
    }
