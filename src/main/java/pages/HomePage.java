package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
   
    public void clickCareers() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement careersLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Careers")));
        careersLink.click();
    }
    
    public void clickBlog() {
        driver.findElement(By.linkText("Blog")).click();
    }
    
    public String getHeaderText() {
        return driver.findElement(By.tagName("h1")).getText();
    }
}