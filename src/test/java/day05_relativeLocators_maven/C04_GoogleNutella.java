package day05_relativeLocators_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_GoogleNutella {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
        //3- cookies uyarisini kabul ederek kapatin

        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin

        String expectedSayfaTitle="Google";
        String actualSayfaTitle=driver.getTitle();
        if (actualSayfaTitle.contains(expectedSayfaTitle)){
            System.out.println("baslık testi, PASSED");
        }else{
            System.out.println("baslık testi, FAILED");
        }

        //5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramaKutusu=driver.findElement(By.id("APjFqb"));
        aramaKutusu.click();
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //6- Bulunan sonuc sayisini yazdirin
        WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(sonucYaziElementi.getText());
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String sonucYazisiStr=sonucYaziElementi.getText();
        String[] sonucYaziKelimeleriArr=sonucYazisiStr.split(" ");
        String sonucSayiAdediStr=sonucYaziKelimeleriArr[1];
        sonucSayiAdediStr=sonucYazisiStr.replaceAll("\\D","");
        int sonucSayisiInt=Integer.parseInt(sonucSayiAdediStr);

        if (sonucSayisiInt>10000000){
            System.out.println("sonuc sayisi testi,PASSED");
        }else{
            System.out.println("sonuc sayisi testi,FAILED");
        }
        //8- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
