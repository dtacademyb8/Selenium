package june13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicElements {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.facebook.com/");


        //button[starts-with(@id, 'u_0_d')]

        //button[ends-with(@id, 'u_0_d')]

        //button[contains(@id, 'u_0_d')]
        driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_d')]")).click();

//

        










    }
}
