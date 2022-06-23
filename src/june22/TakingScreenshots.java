package june22;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots {


    public static void main(String[] args) throws InterruptedException, IOException {





        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");


       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "tes", Keys.ENTER);




        try{
            Assert.assertEquals(driver.getTitle(),"Web Orders");
        }catch (AssertionError e){
            File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotAs, new File("screenshot"+System.currentTimeMillis()+".png"));

        }







       

    }
}
