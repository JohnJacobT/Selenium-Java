package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author johjacob
 * 
 * This program opens Firefox, navigates to web site, 
 * when the web site is loaded closes the browser 
 *
 */
public class A_LaunchFirefox {
	public static void main(String[] args) throws InterruptedException {

		WebDriver wdFirefox = new FirefoxDriver();
		wdFirefox.get("http://google.co.in");
		
		wdFirefox.quit();
	}
}