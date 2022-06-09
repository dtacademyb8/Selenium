package june8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodsGetCurrentUrl {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.get("https://replit.com/");  //Load a new web page in the current browser window

        String currentUrl = driver.getCurrentUrl();//Get a string representing the current URL that the browser is looking at.

        System.out.println("The current url  is " + currentUrl);


    }
}
