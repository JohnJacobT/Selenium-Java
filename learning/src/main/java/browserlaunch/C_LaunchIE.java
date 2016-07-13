package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author johjacob
 * 
 * This program sets IE Driver EXE path, opens IE, maximizes the browser,
 * navigates to website, waits for 3000 milliseconds and then closes browser 
 *
 * Note that Protected Mode (Internet Options>Security) in IE should be same for all zones. 
 * Enable Protected Mode must be set to the same value (enabled or disabled) for all zones.
 * 
 * Also, Zoom level should be set to 100%
 * 
 */
public class C_LaunchIE {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "D:\\Projects\\raw.selenium\\drivers\\IEDriverServer.exe");
		
		WebDriver wdIE = new InternetExplorerDriver();
		wdIE.manage().window().maximize();
		wdIE.get("http://google.co.in");
		
		Thread.sleep(3000);
		
		wdIE.quit();
	}
}