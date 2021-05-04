package ebay;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAccount {

    @Test
    public void loginAccount(){

        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver" , "C:\\Users\\chma6\\Links\\WebAutomation\\driver\\chromedriver.exe");
        driver.get("https://www.google.com/");
          driver.get("https://signup.ebay.com");
          driver.findElement(By.id("gh-ug")).click();
          driver.findElement(By.id("create-account-link")).click();
           driver.findElement(By.id("firstname")).sendKeys("Muhammad");
           driver.findElement(By.id("lastname")).sendKeys("Ali");
           driver.findElement(By.id("Email")).sendKeys("chma616@gmail.com");
           driver.findElement(By.id("password")).sendKeys("Alidhoom3756");
           driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
         driver.findElement(By.id("gh-logo")).click();
       driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-shop-a")).click();
        driver.findElement(By.id("gh-p-3")).click();
        driver.findElement(By.id("popular_solution_1")).click();
        driver.findElement(By.id("gh-Alerts-i")).click();
    }
}
