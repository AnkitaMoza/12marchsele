package seleniumStudy;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampl1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		
		Point p = new Point(400,200);
		
		driver.manage().window().setPosition(p);
		Point m = driver.manage().window().getPosition();
		System.out.println(m);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
	}
	
	
}
