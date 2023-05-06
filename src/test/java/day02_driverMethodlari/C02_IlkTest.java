package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) throws InterruptedException {

        // 1. Yeni bir package olusturalim : day01
        // 2. Yeni bir class olusturalim : C03_GetMethods
        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        // 4. Sayfa basligini(title) yazdirin
        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        // 6. Sayfa adresini(url) yazdirin
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        // 8. Sayfa handle degerini yazdirin
        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        // 10. Sayfayi kapatin.


        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        // 4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : " +driver.getTitle());
        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik="Amazon";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title Amazon içeriyor, test PASSED");
        }else {
            System.out.println("Title Amazon içermiyor,test FAİLED");
        }

        // 6. Sayfa adresini(url) yazdirin
        System.out.println("sayfa url :" +driver.getCurrentUrl());
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        expectedIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Url amazon içeriyor, test PASSED");
        }else{
            System.out.println("url amazon içermiyor, test PASSED");
        }
        // 8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanin handle degeri :" +driver.getWindowHandle());

        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        expectedIcerik="alisveris";
        String actualPageSource=driver.getPageSource();

        if (actualPageSource.contains(expectedIcerik)){
            System.out.println("sayfa kodlari alisveris içeriyor, test PASSED");
        }else{
            System.out.println("sayfa kodlari alisveris içermiyor, test FAILED");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
