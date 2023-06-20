package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SingleBrowserTesting
{
    public static void main(String[] args)
    {
        String baseUrl ="https://demo.nopcommerce.com/";

        // Launch the Chrome Browser OR Setup Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open URL into Browser
        driver.get(baseUrl);
        // Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
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
