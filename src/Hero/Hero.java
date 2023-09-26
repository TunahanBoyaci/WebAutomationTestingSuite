package Hero;

import Utilities.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Hero extends ParameterDriver {
    @Test
    public void test1(){
        login();

        WebElement alertButton = driver.findElement(By.id("alerttest"));
        alertButton.click();

        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void test2(){
        login();

        WebElement alertButton = driver.findElement(By.id("alerttest"));
        alertButton.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        WebElement basButton = driver.findElement(By.id("basicajaxtest"));
        basButton.click();
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void test3(){
        login();

        WebElement findButton = driver.findElement(By.id("findbytest"));
        findButton.click();

        List<WebElement> elements = driver.findElements(By.cssSelector("div[id='div1']>p[class='normal']"));
        System.out.println(elements.get(4).getText());
    }
}
