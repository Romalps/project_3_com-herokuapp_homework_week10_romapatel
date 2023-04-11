package project_3_com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
Project-3 - Project Name: com-herokuapp
BaseUrl = http://the-internet.herokuapp.com/login
1. Setup Chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browser
 */
public class ChromeBrowser {
    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL
        driver.get(baseUrl);
        //Maximise the Window
        driver.manage().window().maximize();
        // give Implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get and Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get and Print current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Get and Print Page source
        System.out.println("Page source: " + driver.getPageSource());
        // Find and enter email to email field
        driver.findElement(By.id("username")).sendKeys("prime123@gmail.com");
        //Find and enter password to password field
        driver.findElement(By.id("password")).sendKeys("Prime123");

        // close the browser
        driver.close();
    }
}
