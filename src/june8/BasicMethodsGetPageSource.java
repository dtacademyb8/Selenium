package june8;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class BasicMethodsGetPageSource {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.get("https://www.google.com/");  //Load a new web page in the current browser window





        String pageSource = driver.getPageSource(); // returns the entire html code of the page

//        System.out.println(pageSource);

        String expectedText = "Carbon neutral since 2007";


        Assert.assertTrue(pageSource.contains(expectedText));


    }
}
