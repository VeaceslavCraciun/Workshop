package draft;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SecondTest {
    /**
     * Add product to the cart as logged user
     * 1. Open the website
     * 2. Go to login page
     * 3. Login with valid credentials
     * 4. Search for product
     * 5. Sort the results by price in ascending order
     * 6. Select the cheapest item
     * 7. Add the item to the cart
     * 8. Open the cart and check that item is present
     */
    @Test
    public void secondTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pandashop.md/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Pandashop.md - интернет-магазин бытовой техники и электроники. Низкие цены и доставка по Кишиневу и Молдове"));
        WebElement element = driver.findElement(By.xpath("//a[text()='Вход | Регистрация']"));
        element.click();
        Assert.assertTrue(title.equals("Вход в магазин"));
        driver.quit();
    }


    @Test
    public void testString(){
        String str = "Hello World!";
        assertThat(str, notNullValue()); //1
        assertFalse(str.isEmpty()); //2
        assertThat(str, containsString("rl")); //3
//        assertEquals(str.split(" ") [1], "World"); //4
        assertEquals(3, str.length()); //5
    }
}
