package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author johjacob
 * 
 * This program sets Chrome Driver EXE path, opens Chrome, 
 * navigates to website, waits for 3000 milliseconds and then closes browser 
 *
 * Selenium handles firefox natively. So we din't have to download driver separately
 * and set the path explicitly, in the last program
 * Also, since sleep is used you need to add throws InterruptedException
 * 
 */
public class B_LaunchChrome {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\raw.selenium\\drivers\\chromedriver.exe");
		
		WebDriver wdChrome = new ChromeDriver();
		wdChrome.get("http://google.co.in");
		
		Thread.sleep(3000);
		
		wdChrome.quit();
	}
}