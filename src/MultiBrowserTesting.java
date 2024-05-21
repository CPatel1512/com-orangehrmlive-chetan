import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

//Launch the Chrome Broswer
        WebDriver driver = new ChromeDriver();
//Open the Url
        driver.get(baseUrl);
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Print title of the page
        System.out.println("The tilte of the page : " + driver.getTitle());
        //Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("The source: " + driver.getPageSource());
        //Click on 'Forgot your password ' link
        driver.findElement(By.className("orangehrm-login-forgot")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        //Navigate back to login page
        driver.navigate().back();
        //Refresh the page
        driver.navigate().refresh();
        //Enter email to email field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter the password to password field.
        driver.findElement(By.name("password")).sendKeys("admin123");
// Click on Login Button.
        driver.findElement(By.tagName("button")).click();

        //Close the browser
        driver.quit();
    }
}
