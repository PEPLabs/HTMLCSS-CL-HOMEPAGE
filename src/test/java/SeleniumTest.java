import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SeleniumTest {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        // Get file
        File file = new File("Intro.html");
        String path = "file://" + file.getAbsolutePath();

        // Create a new ChromeDriver instance
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        webDriver = new ChromeDriver(options);

        // Open the HTML file
        webDriver.get(path);
    }

    @After
    void teardown() {
        webDriver.quit();
    }

    /*
    TODO: Write tests
     */

}