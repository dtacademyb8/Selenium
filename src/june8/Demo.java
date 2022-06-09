package june8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {


        Scanner scan  =  new Scanner(System.in);

        System.out.println("Enter the browser type: ");

        String browser = scan.next();
        WebDriver driver = null;

        switch (browser){

            case "chrome" :
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
                driver =  new ChromeDriver();
                driver.get("https://replit.com/");
                break;

            case "firefox" :
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\geckodriver.exe");
                driver =  new FirefoxDriver();
                driver.get("https://replit.com/");
                break;

            case "edge" :
                System.setProperty("webdriver.edge.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\msedgedriver.exe");
                driver =  new EdgeDriver();
                driver.get("https://replit.com/");
                break;
        }




//          WebDriver webDriver = new WebDriver();

        // ChromeDriver driver = new

//


//










    }
}
