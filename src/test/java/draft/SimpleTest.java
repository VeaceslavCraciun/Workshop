package draft;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

    @Test
    public void simpleTest(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.pandashop.md/ru/profile/");
//    String title = driver.getTitle();
//    Assert.assertTrue(title.equals("Pandashop.md - интернет-магазин бытовой техники и электроники. Низкие цены и доставка по Кишиневу и Молдове"));
////

    driver.quit();
    }
}
