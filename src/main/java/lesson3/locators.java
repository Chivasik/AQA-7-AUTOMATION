package lesson3;

import driver_factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {

    public static void main(String[] args) throws InterruptedException {

//        //By.id
        WebDriver driver = DriverSetUp.setUpDriver();
//        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
//        By locator = By.id("search");
//        WebElement element = driver.findElement(locator);
//        element.click();
//        Thread.sleep(1500);
//
//        //By.name
//        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
//        Thread.sleep(1500);
//        try{
//            driver.findElement(By.id("ez-accept-all")).click();
//        }catch (NoSuchElementException e){
//            System.out.println("Element not found");
//        }
//        driver.findElement(By.name("Username")).sendKeys("My first text");
//        Thread.sleep(3000);
//        driver.quit();

        //by.linkText()
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("APPLICATION PROCESS")).click();
        Thread.sleep(2000);


        //By.partialLinkText()
        driver.findElement(By.partialLinkText("CORDS SHOW")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
