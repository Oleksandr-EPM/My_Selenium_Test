package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTest extends BaseTest {
    @Test
    public void testSearchResults() {
        WebElement searchIcon = driver.findElement(By.xpath("//div[contains(@class, 'header-search-ui')]/button"));
        searchIcon.click();

        WebDriverWait wait = new WebDriverWait(driver, 100);
        //WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//div[@class='header-search__panel opened']//input[@name='q']"));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-search__panel opened']//input[@name='q']")));
        //WebElement searchBox = driver.findElement(By.xpath("//div[@class='header-search__panel opened']//input[@name='q']"));
        searchBox.sendKeys("automation");

        //div[@class='header-search__panel opened']/form//button
        WebElement findButton = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/div/ul/li[3]/div/div/form/div[1]/button/span"));
        findButton.click();

        WebElement resultText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='search-results__counter']")));
        //WebElement resultText = driver.findElement(By.xpath("//h2[@class='search-results__counter']"));
        Assert.assertTrue(resultText.isDisplayed());
    }
}
