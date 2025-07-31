package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;

public class NavigationTests extends BaseTest {

    @Test
    
    public void testNavigateToCareersPage() {
        HomePage home = new HomePage(driver);
        home.clickCareers();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Career"));

        Assert.assertTrue(driver.getTitle().contains("Career"), "Page title should contain 'Career'");
    }

    @Test
    public void testNavigateToContactPage() {
        HomePage home = new HomePage(driver);
        home.clickBlog();
        AssertJUnit.assertTrue(driver.getCurrentUrl().contains("blog"));
    }
}