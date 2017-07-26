package ua.com.tickethub;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testTest() throws Exception {
        driver.get("https://www.google.com/");
    }

}
