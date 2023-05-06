package day05_relativeLocators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html ");
        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        //aradıgımız web elementin bir ozelliği+locate edilebilen bir web elemente göre konumu lazım
        //tag ı img,NYC nin altında diyelim
        WebElement nyc= driver.findElement(By.id("pid3_thumb"));
        WebElement berlin1=driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc));
        if (berlin1.getAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin1 testi PASSED");
        }else{
            System.out.println("Berlin1 testi FAILED");
        }

        //bostonun sağında
        WebElement boston= driver.findElement(By.id("pid6_thumb"));
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));
        if (berlin2.getAttribute("id").equals("pid7_thumb")){
            System.out.println("Berlin2 testi PASSED");
        }else{
            System.out.println("Berlin2 testi FAILED");
        }
        //3 ) Relative locator’larin dogru calistigini test edin


        Thread.sleep(3000);
        driver.close();
    }
}
