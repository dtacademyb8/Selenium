package june20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTables {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

        driver.findElement(By.linkText("View all products")).click();

        // Verify MyMoney Details

//        String text = driver.findElement(By.xpath("//table[@class='ProductsTable']//tr[2]")).getText();
//
//        String expectedPrice = "$100";
//        String expectedDiscount = "8%";
//
//        String[] split = text.split(" ");
//
//        Assert.assertEquals(split[1], expectedPrice);
//        Assert.assertEquals(split[2], expectedDiscount);

        // Dynamically grab any element from the table


        // Verify FamilyAlbum

//        Assert.assertEquals(getCellText(driver, 3, 2), "$80");
//        Assert.assertEquals(getCellText(driver, 3, 3), "15%");


        Assert.assertEquals(getCellTextByProductName(driver, "MyMoney", "Price"), "$100");
        Assert.assertEquals(getCellTextByProductName(driver, "ScreenSaver", "Discount"), "10%");




    }

    public static String getCellText(WebDriver driver, int row, int column){

        String xpath = "//table[@class='ProductsTable']//tr["+row+"]//td["+column+"]";

        System.out.println(xpath);
        return driver.findElement(By.xpath(xpath)).getText();


    }


    public static String getCellTextByProductName(WebDriver driver, String product, String columnName){

        String xpath = "//table[@class='ProductsTable']//td[contains(text(), '"+product+"')]//following-sibling::td["+ (columnName.equals("Price") ? 1 : 2) +"]";

        System.out.println(xpath);
        return driver.findElement(By.xpath(xpath)).getText();


    }

}
