import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver {
    public static void main(String[] args){

       // org.openqa.selenium.WebDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver80.exe");
        //org.openqa.selenium.WebDriver driverChrome= new ChromeDriver();

        WebDriver driver = new ChromeDriver();

    }
}
