package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.nesine.com");
        driver.findElement(By.xpath("//button[@class='e7e9bab3ce2152146f28']")).click();
        driver.findElement(By.id("c-p-bn")).click();
        driver.findElement(By.xpath("//a[@data-dismiss='modal'][1]")).click();
        driver.findElement(By.xpath("//a[@tracking-label='Header-HemenUyeOl']")).click();
        WebElement adKutusuElementi= driver.findElement(By.xpath("//input[@data-trigger='focus']"));
        adKutusuElementi.click();
        adKutusuElementi.sendKeys("Ahmet");
        WebElement soyadKutusu= driver.findElement(By.xpath("//input[@id='surname']"));
        soyadKutusu.click();
        soyadKutusu.sendKeys("Yigitsoy");
        WebElement tcNoKutusu= driver.findElement(By.xpath("//input[@id='tcKimlikNo']"));
        tcNoKutusu.click();
        tcNoKutusu.sendKeys("12345678910");
        WebElement gunKutusu= driver.findElement(By.xpath("//select[@id='drpDay'][1]"));
        gunKutusu.click();
        gunKutusu.sendKeys("25");
        WebElement ayKutusu= driver.findElement(By.xpath("//div[@class='col-xs-4 col-sm-3']"));
        ayKutusu.click();
        ayKutusu.findElement(By.xpath("//*[text()='Aralık']")).click();
        WebElement yilKutusu= driver.findElement(By.xpath("//div[@class='col-xs-4 col-sm-3 col-md-2']"));
        yilKutusu.click();
        yilKutusu.findElement(By.xpath("//*[text()='1999']")).click();
        WebElement telNoKutusu= driver.findElement(By.xpath("//input[@id='telNumara']"));
        telNoKutusu.sendKeys("0(545) 654 34 43");
        WebElement sifreKutusu= driver.findElement(By.xpath("(//input[@type='password'])[4]"));
        sifreKutusu.click();
        sifreKutusu.sendKeys("A1b2c3d4E5");
        WebElement sifreTekrarKutusu= driver.findElement(By.xpath("(//input[@type='password'])[5]"));
        sifreTekrarKutusu.click();
        sifreTekrarKutusu.sendKeys("A1b2c3d4E5");
        driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[6]")).click();//uyelik sozlesmesi
        driver.findElement( By.xpath("(//ins[@class='iCheck-helper'])[7]")).click();//kvk sozl
        driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[8]")).click();//ileti kuralları
        WebElement uyeOlButonu= driver.findElement(By.id("btnSave"));
        uyeOlButonu.click();















        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.click();
        userName.sendKeys("Ahmet Yigitsoy" + Keys.ENTER);
        WebElement sifreKutusuElementi= driver.findElement(By.xpath("//input[@id='realpass']"));
        sifreKutusu.click();
        sifreKutusu.sendKeys("123456"+Keys.ENTER);











        Thread.sleep(3000);
      //  driver.close();
    }
}
