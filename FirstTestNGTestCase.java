import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstTestNGTestCase {
    WebDriver driver;

     @Test(priority = 1)
    void openBrowser() {
        System.out.println("open Browser");
        System.setProperty("webdriver.edge.driver", "C:\\Software\\Drivers\\msedgedriver.exe");
         driver = new EdgeDriver();
         driver.get("https://demo.nopcommerce.com/");

    }

    @Test(priority = 2)
    void register(){
         System.out.println("register user detail");
    }
    @Test(priority = 3)
    void login(){
         System.out.println("User login");
         driver.findElement(By.className("ico-login")).click();

         driver.findElement(By.id("Email")).sendKeys("ekta123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ekta$123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
   }
    @Test(priority = 4)
    void CloseBrowser() throws InterruptedException {
         Thread.sleep(2000);
        System.out.println("close Browser");
    }
    }

