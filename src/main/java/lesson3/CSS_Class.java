package lesson3;

import driver_factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Class {

    public static void main(String[] args) {

        WebDriver driver = DriverSetUp.setUpDriver();

        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");

        driver.findElement(By.cssSelector(".btn.blue")).click();

        //Поиск по классу  .имя класса
        //Поиск по тегу button
        //Поиск по id #search
        //tag_name[]@name_of_attribute='value'] -> xpath
        //tag_name[name_of_attribute='value'] -> css

        //css по буквосочетанию [placeholder*='ear']
        //css по конечному буквосочетанию [placeholder$='arch']
        ////через пробез можем двигаться вниз по дереву -> .block.no-margin div div

    }
}