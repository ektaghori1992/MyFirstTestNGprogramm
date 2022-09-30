import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PracticeTestNGTestCase2 {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("open Browser");
        System.setProperty("webdriver.edge.driver", "C:\\Software\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test(priority = 2)
    void selectComputer() {
        System.out.println("Select computer");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();

    }

    @Test(priority = 3)
    void addToCart() {
        System.out.println("Add to Cart");
        driver.findElement(By.id("product_enteredQuantity_3")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-3\"]")).click();
        WebDriverWait wait =new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")));
        driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")).click();


    }
    @Test(priority = 4)
    void updateQty(){
        driver.findElement(By.className("qty-input")).clear();
       // driver.findElement(By.id("itemquantity11227")).sendKeys("3");
       // driver.findElement(By.xpath("//*[@id=\"itemquantity11231\"]")).sendKeys("3");
        driver.findElement(By.className("qty-input")).sendKeys("3");

        driver.findElement(By.id("updatecart")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Test(priority = 5)
    void checkOutAsGuest(){
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Ekta");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Ghori");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("ekta123@gmail.com");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("1 Blythbridge");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("mk107ay");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"opc-shipping_method\"]/div[1]")).click();

      //  WebElement radio1 = driver.findElement(By.id("shippingoption_1"));
        //WebElement radio1 = driver.findElement(By.id("shippingoption_1"));
       // WebElement radio1 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[2]/div[1]/input"));
       //WebElement radio1 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[2]/div[1]/label"));
        // WebElement radio = driver.findElement(By.xpath("//*[@id=\"shippingoption_1\"]"));
        //radio.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(230, TimeUnit.SECONDS);
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
        driver.findElement(By.id("CreditCardType")).sendKeys("Mastercard");
        driver.findElement(By.xpath("//*[@id=\"CardholderName\"]")).sendKeys("Ekta");
        driver.findElement(By.id("CardNumber")).sendKeys("12341235412345678");
        driver.findElement(By.id("ExpireMonth")).sendKeys("05");
        driver.findElement(By.id("ExpireYear")).sendKeys("2025");
        driver.findElement(By.id("CardCode")).sendKeys("342");
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
    }
//
//    @Test(priority = 6)
//    void CloseBrowser() throws InterruptedException {
//        Thread.sleep(2000);
//        System.out.println("close Browser");
    }
