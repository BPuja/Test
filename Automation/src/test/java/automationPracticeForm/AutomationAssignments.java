package automationPracticeForm;

//1.Verify the partial link test exists and it links to/automation-practice-form/

import com.sun.tools.sjavac.server.Sjavac;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAssignments {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Before

    public void question1()throws InterruptedException{
        System.setProperty("driver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize();
    }
    @Test

    public void second()throws InterruptedException {

        driver.findElement(By.linkText("Partial Link Test")).isDisplayed();

        Assert.assertTrue(driver.findElement(By.linkText("Partial Link Test")).isDisplayed());

        System.out.println("Partial link test Exists");



        /* if (driver.findElement(By.linkText("Partial Link Test")).isDisplayed()){
        System.out.println("Partial link test exists");}
       else {
           System.out.println("Partial link test does not exist");
       }*/

    }
    @Test

    public void question2() throws InterruptedException{

        //2.Verify Link Test existsand link to/automation-practice-table/

        driver.findElement(By.linkText("Link Test")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.linkText("Link Test")).isDisplayed());
        System.out.println("Link Test exists");


    }
    @Test
    public void question3() throws InterruptedException{

        //3.Enter firstname

        driver.findElement(By.name("firstname")).sendKeys("PUJA");

    }

    @Test
    public void question4() throws InterruptedException{
        //4.Enter lastname

        driver.findElement(By.id("lastname")).sendKeys("BUDHATHOKI");
    }

    @Test
    public void question5() throws InterruptedException{
        //5. Choose sex as female


        WebElement female_radio_button=driver.findElement(By.id("sex-1"));
        female_radio_button.click();



    }




}
