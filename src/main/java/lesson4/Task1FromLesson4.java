package lesson4;

import driver_factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task1FromLesson4 {

    @FindBy(xpath = "(//button[contains(@class,'header__button ng-star-inserted')])[1])")
    private static WebElement loginButton;

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button")).click();
        driver.findElement(By.id("auth_email")).sendKeys("email@email.com");
        driver.findElement(By.id("auth_pass")).sendKeys("password");
        Thread.sleep(2000);
        String textFromElement = driver.findElement(By.cssSelector(".auth-modal__register-link.button.button--link.ng-star-inserted")).getText();
        System.out.println(textFromElement);
        Thread.sleep(2000);
        driver.quit();


    }
}
// На сайте https://rozetka.com.ua/ открыть форму логина, ввести имя и пароль, убрать чекбокс "Запомнить меня"
// Вывести в консоль текст элемента "Зарегистрироваться"
// Закрыть модальное окно