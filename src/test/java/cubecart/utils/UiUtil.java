package cubecart.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UiUtil  {
    public static WebElement getElement(String locator ){
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public static void ClickElement (String locator ){
       getElement(locator).click();
    }

    public static void sendKeys(String locator,String text ){
        getElement(locator).sendKeys(text);
    }

    public static String getText(String locator ){
        return getElement(locator).getText();
    }

    public static boolean isDisplayed(String locator){
        return getElement(locator).isDisplayed();
    }
    public static void SelectFromDropDown(String locator){
         WebElement DropDown=getElement(locator);
        Select select=new Select(DropDown);
        List <WebElement> options=select.getOptions();

    }
    public static void switchToFrame(String locator){
        WebElement frame=getElement(locator);
        Driver.getDriver().switchTo().frame(frame);
        //and to switch back:
        Driver.getDriver().switchTo().defaultContent();

    }

    public static void dragAndDrop(String locator1,String locator2){
        WebElement dragElement=getElement(locator1);
        WebElement dropElement=getElement(locator2);
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(dragElement,dropElement).build().perform();
    }

}
