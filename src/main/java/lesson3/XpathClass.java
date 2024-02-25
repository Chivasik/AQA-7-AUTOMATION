package lesson3;

import driver_factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
//        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
//        //ByXpath
//        driver.findElement(By.xpath("//a[@title='Search']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@type='text']"))
//                .sendKeys("handstand push ups");
//
//        //By.xpath() with text
//
//        driver.findElement(By.xpath("//button[text()='Search']")).click();
//        Thread.sleep(2000);

        //By.xpath() contains
//        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//a[contains(text(), 'LICATION PR')]")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("(//a[contains(@href, '/search/appli')])[1]")).click();
//        Thread.sleep(1500);
//        driver.quit();
//

        //driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");

        //xpath - операторы <, >, >=, <=, !=
        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
        Thread.sleep(1500);
        driver.findElement((By.id("ez-accept-all"))).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@data-val-length-max!=100]")).sendKeys("email@email.com");
        driver.findElement(By.xpath("//input[@data-val-length-max<200]")).sendKeys("password");
        Thread.sleep(2500);
        driver.quit();
    }
}
