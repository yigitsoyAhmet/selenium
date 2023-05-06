package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        //  1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        String expectedTitle="Spend less";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Baslik testi PASSED");
        }else{
            System.out.println("Baslik testi FAILED");
        }
        //6- Gift Cards sekmesine basin

        driver.findElement(By.xpath("//a[@class='nav-a  '][4]"));
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//span[@class='nav-a-content'][2]")).click();
        driver.findElement(By.xpath("//img[@alt='Amazon Reload']")).click();
        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//button[@name='selectAmount'][1]")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretElementi=driver.findElement(By.xpath("//button[@value='25.0']"));
        String expectedDeger="25$";
        String actualDeger=ucretElementi.getText();

        if (expectedDeger.equals(actualDeger)){
            System.out.println("Ucret testi PASSED");
        }else{
            System.out.println("Ucret testi FAILED");
        }
        //11-Sayfayi kapatin
        driver.close();
    }
}
