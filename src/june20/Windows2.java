package june20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows2 {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/");



       //Switching by window's title is easier and more flexible approach since you don't need to store each window's handle everytime when you switch to a new window


        driver.findElement(By.linkText("FORUM")).click(); // open  1st tab


        driver.findElement(By.xpath("//a[@href='https://www.instagram.com/w3schools.com_official/']")).click(); //// open  2nd tab


        Set<String> windowHandles = driver.getWindowHandles();// grab all window handles


        for (String windowHandle : windowHandles) {   // iterate through the handles and switch to that window by handle and check if title is what you expect and stay in that window by breaking the loop

            driver.switchTo().window(windowHandle); //switch to a window by its handle

            if(driver.getTitle().equals("Forums - W3Schools Forum")){  // check the title
                break;   // if it's the desired window's title stay here
            }
        }


        System.out.println(driver.getTitle());







        //switch back to first window




        // Switch to new window by using that window's title











    }
}
