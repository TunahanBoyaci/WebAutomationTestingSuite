package Hero;

import Utilities.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo extends ParameterDriver {
    @Test
    public void test10(){
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkButton = driver.findElement(By.cssSelector("input[id='check1']"));
        checkButton.click();
        Assert.assertTrue(checkButton.getAttribute("value").equals("Uncheck All"));
    }
}