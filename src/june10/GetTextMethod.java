package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");

        System.out.println(driver.findElement(By.name("login")).getText());



        // get text return the text of all the inner elements of the element

        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");

        System.out.println(driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']")).getText());

    }
}
