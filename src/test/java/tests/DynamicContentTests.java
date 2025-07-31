package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicContentTests extends BaseTest {

    
    @Test
    public void testMainHeadlineVisibility() {
        // Wait for the main headline to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        // This heading appears on the main hero section
        WebElement headline = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//section[contains(@class, 'hero')]//h1")));

        Assert.assertTrue(headline.isDisplayed(), "Main headline should be visible.");
        System.out.println("Headline Text: " + headline.getText());
    }
    
    
}