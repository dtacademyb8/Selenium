package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.filemail.com/share/upload-file");

       driver.findElement(By.xpath(" //input[@type='file']")).sendKeys("C:\\Users\\Nuclues\\Downloads\\XPath.pdf");
    }
}
