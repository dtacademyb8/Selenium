package june22;

import june15.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.rmi.CORBA.Util;
import java.awt.*;

public class FileDownload {


    public static void main(String[] args) throws InterruptedException {





        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://unsplash.com/images");


        Utility.jsClick(driver, driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/OPcqF9a0ADs/download?force=true']")));




    }
}
