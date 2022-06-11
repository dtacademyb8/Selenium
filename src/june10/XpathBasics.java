package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasics {


    public static void main(String[] args) {


        // absolute xPath
        // /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");


//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("dcghsvcdhgdsg");



        driver.findElement(By.xpath("//a[@href='https://ar-ar.facebook.com/']")).click();

//        basic syntax -> //tag[@attr='value']


        // using multiple attributes


        //a[@class='_sv4'][@title='Spanish']


        //By exact text -> //h2[.='Connect with friends and the world around you on Facebook.']


        // By partial text match  -> //h2[ contains( text() , 'around you on Facebook'  )]

    }
}
