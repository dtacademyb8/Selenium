package june8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.manage().window().maximize(); // maximizes the window


        driver.get("https://www.google.com/");  //Load a new web page in the current browser window
        Thread.sleep(1000);

        driver.navigate().to("https://www.duotech.io/");

        Thread.sleep(1000);

        driver.navigate().to("https://www.instagram.com/");

        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();







    }
}
