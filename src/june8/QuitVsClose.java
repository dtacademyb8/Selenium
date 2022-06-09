package june8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class QuitVsClose {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.manage().window().maximize(); // maximizes the window


        driver.get("https://www.google.com/");  //Load a new web page in the current browser window

        String actualTitle = driver.getTitle();

        String expectedTitle= "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

        String expectedSearchTerm = "Selenium";
//        driver.findElement(By.name("q")).sendKeys( expectedSearchTerm  + Keys.ENTER);

        driver.findElement(By.linkText("About")).sendKeys( Keys.LEFT_CONTROL, Keys.ENTER);
        driver.findElement(By.linkText("Store")).sendKeys( Keys.LEFT_CONTROL, Keys.ENTER);

        Thread.sleep(2000);

//        driver.close(); //Close the current window, quitting the browser if it's the last window currently open
        driver.quit(); // Quits this driver session, closing every associated window

    }
}
