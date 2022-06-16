package june15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

    public static void jsClick(WebDriver driver, WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }


    public static void jsSendKeys(WebDriver driver, String cssExpression, String value){
        ((JavascriptExecutor)driver).executeScript("document.querySelector(\"" + cssExpression+"\").value = \""+value+"\";" );
    }

    public static void scroll(WebDriver driver, int x, int y){
        ((JavascriptExecutor)driver).executeScript("window.scrollBy("+x+","+y+")");
    }

    public static void scrollToElement(WebDriver driver, WebElement element){

        int y = element.getLocation().getY();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+ y +")");
    }


}
