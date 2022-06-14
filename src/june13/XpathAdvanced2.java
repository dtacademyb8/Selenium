package june13;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvanced2 {


    public static void main(String[] args) {


        //a[contains( text(), 'Non-Users' )]  -> Partial match
        //a[text()='Help' ] or //a[.='Help' ] -> exact match


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");

//

        //em[contains(text(),'Great learning environment')]/parent::p  -> locating the unique child and based on it locating the non-unique parent

        //em[contains(text(),'Great learning environment')]/ancestor::p  -> locating the unique child and based on it locating the non-unique ancestor

       //       (//div[@class='review-card-info-2'])[3]//preceding-sibling::p  -> locating the unique element and based on it locating its non-unique preceding sibling

        //       (//div[@class='review-card-info-2'])[3]//following-sibling::p  -> locating the unique element and based on it locating its non-unique preceding sibling













    }
}
