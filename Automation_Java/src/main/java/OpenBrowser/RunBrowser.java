package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RunBrowser {


//    public void openChromeBrowser() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver80.exe");
//
//        WebDriver wd = new ChromeDriver();
//        wd.get("http://www.gmail.com");
//        wd.manage().window().maximize();
//
//        Thread.sleep(5000);
//        wd.quit();



    @Test

    public void openFirefoxBrower() throws InterruptedException {




        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver wd = new FirefoxDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();


        WebDriver driver = null;

        wd.findElement(By.id("identifierId")).sendKeys("budhathoki.puzaah@gmail.com");


        WebDriverWait wait=new WebDriverWait(driver, 20);

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asassassa");

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();



        Thread.sleep(5000);
        wd.quit();



    }
}