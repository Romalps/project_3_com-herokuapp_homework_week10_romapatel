package project_3_com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String baseUrl="http://the-internet.herokuapp.com/login";
    static String browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver=new FirefoxDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        // Open the URL
        driver.get(baseUrl);
        // maximise the Browser
        driver.manage().window().maximize();
        // give implicit wait  to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        // Get and print Current URL
        System.out.println("Current URL :  "+driver.getCurrentUrl());
        // Get and print page source
        System.out.println("Page source : "+ driver.getPageSource());
        // find and enter email to email field
        driver.findElement(By.id("username")).sendKeys("prime123@gmail.com");
        // Find and enter password to password field
        driver.findElement(By.id("password")).sendKeys("Prime123");

        //close the browser
        driver.close();

    }
}
