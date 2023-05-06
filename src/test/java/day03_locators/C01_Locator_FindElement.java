package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_FindElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

    //arama kutusuna amazon yazdırın?

        WebElement aramaKutusuElementi =driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();


        //test otomasyonda web elementi kullanmak istesek 2 seye ihtiyacımız var
        // 1- O web elementi benzersiz olarak tarifliycemiz locator
        // 2- Bu locator i soyledigimizde bize web elemeti bulup getirecek method
        // örneğin arama kutusunun unique tarifi id twotabsearchtextbox kullanabiliriz


       //noSuchElementExeption varsa locator da bir hata vardır.


        Thread.sleep(4000);
        driver.close();
    }
}
