package tests;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormInteractionTests extends BaseTest {

    @Test
    public void testInputFieldsOnWatchDemoPage() {
        driver.findElement(By.linkText("Watch demo")).click();
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement fnameField = driver.findElement(By.name("FirstName"));
        WebElement lnameField = driver.findElement(By.name("LastName"));
        WebElement emailField = driver.findElement(By.name("Email"));

        // Interact with fields without submitting
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        fnameField.sendKeys("Test");
        lnameField.sendKeys("User");
        emailField.sendKeys("test@example.com");

        // Assertions to verify fields hold expected values
        assert fnameField.getAttribute("value").equals("Test");
        assert lnameField.getAttribute("value").equals("User");
        assert emailField.getAttribute("value").equals("test@example.com");
    }
}
