package table;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class SumMarks {
    WebDriver driver;

    @Before
    public void table() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        driver.manage().window().maximize();
    }

        @Test
        public void openW3schools()throws InterruptedException{

            double sum = 0.00;
            double expectedSum = 90.35;

            List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));

            for (WebElement row : rows) {
                double num = Double.parseDouble(row.getText());
                sum = sum + num;
            }

            Assert.assertEquals(sum, expectedSum, 2);


        }

        @After
                public void close() {
            driver.quit();
        }
}











