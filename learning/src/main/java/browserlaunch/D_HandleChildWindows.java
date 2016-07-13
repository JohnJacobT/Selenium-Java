package browserlaunch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D_HandleChildWindows {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://rediff.com/");

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itrWindows = windowHandles.iterator();
		
		while(itrWindows.hasNext()){
			String windowHandle = itrWindows.next();
			driver.switchTo().window(windowHandle);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		
		driver.quit();
	}
}
