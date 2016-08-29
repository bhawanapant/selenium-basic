package IE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login {

    public static final String IE_WEB_DRIVER_KEY = "webdriver.ie.driver";
    public static final String IE_WEB_DRIVER_EXE = "D:\\Software\\iedriver\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe";

    public static void main(String[] args) {
        // Create WebDriver reference
        WebDriver driver;

        // Set path for Internet Explorer Driver executable
        System.setProperty(IE_WEB_DRIVER_KEY, IE_WEB_DRIVER_EXE);

        // Launch InternetExplorerDriver
        driver = new InternetExplorerDriver();

        // Open the web page
        driver.get("www.atomic77.com");

        //Click on the Contact Link
        driver.findElement(By.id("menu-item-722")).click();
    }
}
