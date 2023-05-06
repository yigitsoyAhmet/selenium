package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) throws InterruptedException {

        //Automation Exercise Category Testi


      

        
        //        6- Sayfayi kapatin

        //        1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //        2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

        //        3- Category bolumundeki elementleri locate edin
       List<WebElement> categoryElementsList = driver.findElements(By.className("panel-title"));

        //        4- Category bolumunde 3 element oldugunu test edin
       int expectedSize=3;
       int actualSize=categoryElementsList.size();

       if (expectedSize==actualSize){
           System.out.println("Kategori element testi, PASSED");
       }else{
           System.out.println("Kategori element testi,FAILED");
       }
       // System.out.println(categoryElementsList);
        // web elementlerden olusan bir listin kendisi direkt yazdırılamaz,
        // Bir for-each loop kullanılarak list in elementleri yazdırılabilir

        //        5- Category isimlerini yazdirin
        for (WebElement eachElement:categoryElementsList) {

            System.out.println(eachElement.getText());
        }




       Thread.sleep(3000);
       driver.close();


    }
}
