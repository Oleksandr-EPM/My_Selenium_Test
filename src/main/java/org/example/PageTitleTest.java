package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitleTest extends BaseTest {

    @Test
    public void testPageTitle() {

        Assert.assertEquals(driver.getTitle(), ("EPAM | Software Engineering & Product Development Services"),
                "Message title is not the same");
    }
}
