package june13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {


    public static void main(String[] args) {





        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        // absolute cssSelector path
        System.out.println(driver.findElement(By.cssSelector("html body div div")).getText());


        //  input.inputtext -> input element with class "inputtext'

       // input.inputtext._55r1._6luy  -> input element with class "inputtext" and "_55r1" and "_6luy"

        //input#email -> input element with id email
        //#email -> can be simplified as here


        // Using attributes

       // input[data-testid='royal_email']
       //input[data-testid='royal_email'][autofocus='1']  -> multiple attributes



        //div[id^='_'] -> div whose id starts-with _
        //div[id$='1'] -> div whose id ends-with 1
       //div[id*='_username_'] -> div whose id contains _username_

       //  div[id^='_'][id$='1']  -> div whose id starts-with _ and ends with 1












    }
}
