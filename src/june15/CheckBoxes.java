package june15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class CheckBoxes {


    public static void main(String[] args) {






        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

        WebElement newUsed = driver.findElement(By.id("make-model-search-stocktype"));

        Select select  =  new Select(newUsed);


        select.selectByIndex(3);  // zero-based index

        new Select(driver.findElement(By.id("makes"))).selectByVisibleText("BMW");

        driver.findElement(By.id("make-model-zip")).clear();
        driver.findElement(By.id("make-model-zip")).sendKeys("22160" + Keys.ENTER);


        driver.findElement(By.xpath("//label[@for='model_bmw-135']")).click();

        WebElement element = driver.findElement(By.id("model_bmw-135"));

        if(!element.isSelected()){  // to check if it is not selected already
            Utility.jsClick(driver, element );
        }


        Utility.jsClick(driver, driver.findElement(By.id("model_bmw-i8")));


        // Click on all checkboxes
//        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@id='model']//input[@type='checkbox']"));
//
//        for (WebElement element : webElementList) {
//
//            if(!element.isSelected()){
//                Utility.jsClick(driver, element);
//            }
//
//        }


    }



}
