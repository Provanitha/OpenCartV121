import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		   // Set the path for the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the desired URL
        driver.get("https://example.com"); // Replace with your URL

        // Maximize the browser window
        driver.manage().window().maximize();

        // Get the current window handle (parent window)
        String parentWindow = driver.getWindowHandle();

        // Click on a link or button that opens a new window (you can replace this with a valid element)
        driver.findElement(By.id("newWindowButton")).click(); // Replace with actual element that opens new window

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Iterate over all windows and switch to the new one
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                // Switch to the new window
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to new window with title: " + driver.getTitle());

                // Perform actions in the new window
                driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");

                // Close the new window
                driver.close();

                // Switch back to the parent window
                driver.switchTo().window(parentWindow);
            }
        }

        // Close the parent window
        driver.quit();
    }

	}


