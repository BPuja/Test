package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {
    public static void main(String[] args){
       // System.setProperty("webdriver.gecko.driver","geckodriver.exe");
       // WebDriver driver=new FirefoxDriver();

       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver=new ChromeDriver();

        driver.get("http://www.google.com");
        String title= driver.getTitle();
        System.out.println(title);

        if (title.equals("Google")){
            System.out.println("Correct Title");
        }else {
            System.out.println("Incorrect Title");
        }
        driver.quit();


    }


}
