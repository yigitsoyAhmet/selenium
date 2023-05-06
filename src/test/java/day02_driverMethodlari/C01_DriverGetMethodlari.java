package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //sisteme webdriverimizin ne olacagını ve bu driverin hangi dosya yolunda oldugunu soyler.
        WebDriver driver =new ChromeDriver();
        //pc deki chrome browserin otomasyonla çalısacak bir kopyasını olusturur.
        //chrome dısında bir browser kullanmak istersek o browserin driverini indirip
        //       System.setProperty("webdriver.safari.driver","src/resources/safaridriver.exe");
        driver.get("https://www.amazon.com");
    // www yazmasak da calısır ancak https yazmazsak calısmaz
        Thread.sleep(3000);


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

       // System.out.println(driver.getPageSource());//sayfa kaynak kodları yazdırır

        System.out.println(driver.getWindowHandle());
        //acılan her bir pencereye verilen unique hash code degerdir.
        System.out.println(driver.getWindowHandles());
        //driver calısırken 1 den fazla pencere veya tab olusturduysa acılan tum windows veya tab lerin
        // unique hash code larini bir set olarak dondurur



        driver.close();
    }
}
