package gmailLoginPage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class OpenBrowser {
    /*@Test
    public void login() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver wd =new ChromeDriver();
        wd.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        wd.manage().window().maximize();
        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmail.com");

        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        Thread.sleep(5000);

        wd.findElement(By.name("password")).sendKeys("Test@123");
        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        Thread.sleep(5000);
        wd.quit();


    }
    */


    @Test
    public void validUserInvalidPassword() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmail.com");
        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        Thread.sleep(3000);
        wd.findElement(By.name("password")).sendKeys("verygood");
        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        Thread.sleep(10000);



        WebElement text= wd.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        String expectedtext= "Wrong password. Try again or click Forgot password to reset it.";
        Assert.assertEquals(expectedtext,text.getText());


        
        wd.quit();


    }
}










