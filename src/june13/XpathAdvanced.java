package june13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvanced {


    public static void main(String[] args) {


        //a[contains( text(), 'Non-Users' )]  -> Partial match
        //a[text()='Help' ] or //a[.='Help' ] -> exact match


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");

//        (//div[@class='_6lux']//input)[1] -> Out of 2 matching elements, get the first one
    //    (//div[@class='_6lux']//input)[2] -> Out of 2 matching elements, get the second one

        driver.findElement(By.xpath("(//div[@class='_6lux']//input)[2]")).sendKeys("cdvsghvchgdvhsg");



         //a[@title] -> matches all a elements that have title attribute
        //a[not(@title)] -> matches all a elements that do not have title attribute

        //*[@title] -> matches ALL elements that have title attribute

        //*[@id]  - matches ALL elements that have id attribute





    }
}
