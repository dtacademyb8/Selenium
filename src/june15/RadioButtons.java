package june15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class RadioButtons {


    public static void main(String[] args) {






        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

        WebElement newUsed = driver.findElement(By.id("make-model-search-stocktype"));

        Select select  =  new Select(newUsed);

//        select.selectByVisibleText("Used cars");
//        select.selectByValue("used");
        select.selectByIndex(3);  // zero-based index

        new Select(driver.findElement(By.id("makes"))).selectByVisibleText("BMW");

        driver.findElement(By.id("make-model-zip")).clear();
        driver.findElement(By.id("make-model-zip")).sendKeys("22160" + Keys.ENTER);


        driver.findElement(By.xpath("//button[contains(text(),'Sort')]")).click();


        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio'][@name='sort']"));

//        elements.get(new Random().nextInt(elements.size())).click();



        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elements.get(new Random().nextInt(elements.size())));


    }



}
