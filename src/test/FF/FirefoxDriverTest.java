/* Unable to open BAse URL on FF*/
package FF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class FirefoxDriverTest {

    public static void main(String[] args) {
        // Create webDriver reference
        WebDriver driver;

        // Launch FirefoxDriver
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Open the web page
        driver.get("https://www.google.co.uk");

        // Close the driver
        driver.quit();

    }

}

