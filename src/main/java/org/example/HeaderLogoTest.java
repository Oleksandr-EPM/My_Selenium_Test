package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderLogoTest extends BaseTest {

    @Test
    public void testHeaderLogoExistence() {
        WebElement headerLogo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/div/ul/li[3]/div/button/span[1]"));
        Assert.assertTrue(headerLogo.isDisplayed());
    }
}
