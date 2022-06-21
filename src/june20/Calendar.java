package june20;

import june15.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.orbitz.com/");



        driver.findElement(By.id("d1-btn")).click();


        // Click on July 6 from the calendar
        driver.findElement(By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]//tr//td//button[@data-day='6']")).click();




    }

//
}
