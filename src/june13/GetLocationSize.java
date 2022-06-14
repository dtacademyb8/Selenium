package june13;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationSize {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");


        Dimension size = driver.findElement(By.xpath("//img[@alt='Facebook']")).getSize();

        System.out.println(size);  // (301, 106)


        // we can use this to check if an element is visible


        driver.get("https://www.duotech.io/");

        Dimension size1 = driver.findElement(By.xpath("//a[.='Home'][@class='link-4 w--current']")).getSize();

        System.out.println(size1);  // (0, 0) -> means element is not visible

        //     another way easier
        System.out.println(driver.findElement(By.xpath("//a[.='Home'][@class='link-4 w--current']")).isDisplayed());


    }



}
