package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.duotech.io/");

        List<WebElement> dropDownLinks = driver.findElements(By.className("link-2cxzczxcxzxc"));

        if(dropDownLinks.isEmpty()){
            throw  new RuntimeException("Could not locate any element. The returned list is empty");
        }

        System.out.println("List size is " + dropDownLinks.size());
        for (WebElement element : dropDownLinks ){
            System.out.println(element.getText());  //Get the visible (i.e. not hidden by CSS) text of this element, including sub-elements.
        }


        //Class name is useful when locating multiple elements with a similar class

        //Difference between:

//        1. Return type:
        // findElement() -> WebElement
        // findElements() -> List<WebElement>

         // 2.What happens when the locator is wrong
//        // findElement() -> NoSuchElementException
        // findElements() ->  No exception is thrown, the solution is to add a check like below:
//        if(dropDownLinks.isEmpty()){
//            throw  new RuntimeException("Could not locate any element. The returned list is empty");
//        }




    }
}
