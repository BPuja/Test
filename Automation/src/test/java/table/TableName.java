package table;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableName {
    WebDriver driver;
    @Before
    public void first() throws InterruptedException{
        System.setProperty("weddriver.chrome.driver","chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        driver.manage().window().maximize();

    }
    @Test
    public void second() throws InterruptedException{
        List<String> names = new ArrayList<>();
        List<String> expectedNames= Arrays.asList("Chais","Chang","Aniseed Syrup","Chef Anton's Cajun Seasoning","Chef Anton's Gumbo Mix");
        List<WebElement> a=driver.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));

        for (WebElement b:a){
            names.add(b.getText());
            System.out.println(b.getText());
        }
        Assert.assertEquals(names,expectedNames); 

     }
    @After
    public void exit(){
        driver.quit();
    }
}
