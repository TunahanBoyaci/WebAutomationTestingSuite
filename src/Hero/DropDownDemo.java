package Hero;

import Utilities.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class DropDownDemo extends ParameterDriver {
    @Test
    public void test11() {
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectDropDown = driver.findElement(By.cssSelector("select[id=\"select-demo\"]"));
        Select select = new Select(selectDropDown);
        List<WebElement> optionsOfDays = select.getOptions();

        int wednesdayCount = 0;
        do {
            select.selectByIndex(randomNumber(optionsOfDays));

            if (select.getFirstSelectedOption().getText().equalsIgnoreCase("Wednesday")) {
                wednesdayCount++;
            }

        } while (wednesdayCount < 5);

        System.out.println("Number of times that Wednesday was selected: " + wednesdayCount);

        Assert.assertTrue(wednesdayCount == 5);

    }
}
