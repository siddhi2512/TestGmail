import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	WebDriver driver;
	String name;
	String pwd;
	
	
	public void invokegmail() {
		 File file = new File("C:\\selenium\\chromedriver.exe");
	        
	        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//sdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		    driver.get("http://www.gmail.com");
		
	}
	
	public void login(String name, String pwd) {
		
		
		WebElement emailid=driver.findElement(By.name("identifier"));
		emailid.sendKeys(name);
		
		WebElement idclick=driver.findElement(By.id("identifierNext"));
	
		
		idclick.click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(pwd);
		
		WebElement pwdclick=driver.findElement(By.id("passwordNext"));
		
		pwdclick.click();
		
		
		
		
		
	}
	
	public void logout(){
		
		WebElement sign =driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a"));
		sign.click();
		
		WebElement signout =driver.findElement(By.id("gb_71"));
		signout.click();
		
		
	}
	public static void main(String[] args) {
		
		Gmail gmail =new Gmail();
	 
		// TODO Auto-generated method stub
       gmail.invokegmail();
       gmail.login("siddhisharma025@gmail.com","sid7@happylife");
	
       gmail.logout();
	}
	

}
