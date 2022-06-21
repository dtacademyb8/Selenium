package june20;

import june15.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WebTables4 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.livecoinwatch.com/");



        // Go to livecoinwatch.com

        // Grab all the values from 24h% column and find the currency with the biggest change

        List<WebElement> elements = driver.findElements(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr//td[9]"));

        List<String> elementsText = Utility.getElementsText(driver, elements);

        System.out.println(elementsText);


        List<Double> doubles = new ArrayList<>();

//
//        for (String each : elementsText) {
//               doubles.add( Double.parseDouble(each.replace("%", "")));
//        }
//
//
//        System.out.println("The biggest 24 h change is " + Collections.max(doubles));

         double max = Double.parseDouble(elementsText.get(0).replace("%", ""));
         int indexOfMax = 0;

         for (int i = 1; i < elementsText.size(); i++) {

             double each = Double.parseDouble(elementsText.get(i).replace("%", ""));

             if (each > max){
                 max = each;
                 indexOfMax = i;
             }



        }

        String name =   driver.findElement(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr["+(indexOfMax+1)+"]//td[2]//small")).getText();
        System.out.println("The biggest 24 h change is " + max + " by " + name );





    }

//
}
