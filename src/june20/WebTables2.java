package june20;

import june15.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTables2 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://coinmarketcap.com/");


        int rowNo = driver.findElements(By.xpath("//table[contains(@class, 'cmc-table')]//tbody//tr")).size();

        int colNo = driver.findElements(By.xpath("//table[contains(@class, 'cmc-table')]//thead//th")).size();


        for (int i = 1; i <= rowNo ; i++) {


            for (int j = 1; j <= colNo ; j++) {

                String dynamicXpath = "//table[contains(@class, 'cmc-table')]//tbody//tr["+i+"]//td["+j+"]";

                String eachCellText = driver.findElement(By.xpath(dynamicXpath)).getText();

                System.out.print(eachCellText + "\t");

            }

            Utility.scroll(driver, 0, 100);
            System.out.println();

        }



    }

}
