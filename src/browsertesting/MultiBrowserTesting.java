package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting
{
    static String browser="Chrome";

    static String baseUrl="https://demo.nopcommerce.com/";

    static WebDriver driver;          // Driver Declaration or Global Declaration

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver =new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver =new EdgeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        //Open URL into the Browser
        driver.get(baseUrl);
        //Maximise The Browser
        driver.manage().window().maximize();
        // We Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        String title=driver.getTitle();
        System.out.println("Page Title is :" +title);
        // Get the Current URl
        System.out.println("Current URL:" +driver.getCurrentUrl());
        // Print the page source
        String pageSource= driver.getPageSource();
        System.out.println("Page Source" +driver.getPageSource());
        // Click on Login Link Element
        WebElement loginLink= driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Enter the Email to Email Field
        WebElement emailField=driver.findElement(By.id("Email"));
        // Enter the email to email field
        emailField.sendKeys("prime123@gmail.com");
        // Find the Password Field and type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        // Close the browser
        driver.close();
    }
}
