package june13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HandlingDropdowns {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

        WebElement newUsed = driver.findElement(By.id("make-model-search-stocktype"));

        Select select  =  new Select(newUsed);

//        select.selectByVisibleText("Used cars");
//        select.selectByValue("used");
        select.selectByIndex(3);  // zero-based index

        new Select(driver.findElement(By.id("makes"))).selectByVisibleText("BMW");

        Select select1 =  new Select(driver.findElement(By.id("models")));

        List<WebElement> options = select1.getOptions();  // returns all the options as List

        List<String> allModels = new ArrayList<>();

        for (WebElement option : options) {
           allModels.add(option.getText());
        }

        System.out.println(allModels);
//        select1.selectByIndex(new Random().nextInt(options.size())); // to randomly select

        WebElement firstSelectedOption = select1.getFirstSelectedOption();  // returns the default selected option when the page loads

        Assert.assertEquals(firstSelectedOption.getText(), "All models");


    }
}
