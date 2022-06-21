package june20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/");

        // Grab first window's window handle

        String firstWindowHandle = driver.getWindowHandle();// returns the currently active window's window handle

        System.out.println("First window's handle: "  + firstWindowHandle);

        driver.findElement(By.linkText("FORUM")).click();


        Set<String> windowHandles = driver.getWindowHandles();// returns all open windows' handles

        System.out.println("All window handles: " + windowHandles);

        // iterate though the set and check if the window handle is not the current window handle and if it is not then switch to it using that handle

        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(firstWindowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }


        System.out.println(driver.getTitle());


        //switch back to first window

        driver.switchTo().window(firstWindowHandle);














    }
}
