import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) {
        //Base url Declaration
        String baseUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

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
