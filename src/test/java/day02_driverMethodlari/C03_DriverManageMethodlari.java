package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        //selenium 4.7 versiyonu ile kendi driverini sisteme ekledi,
        // kodlar calısmaya basladıgında biz driver için yol gostermezsek selenium kendi driverini devreye sokuyor

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        System.out.println("baslangıcta konum :" +driver.manage().window().getPosition());//baslangıcta konum :(10, 10)
        System.out.println("baslangıcta boyut :" +driver.manage().window().getSize());//baslangıcta boyut :(1050, 660)

        Thread.sleep(1000);
        driver.manage().window().maximize();

        System.out.println("Max konum :" +driver.manage().window().getPosition());
        System.out.println("Max boyut :" +driver.manage().window().getSize());
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("FUL konum :" +driver.manage().window().getPosition());
        System.out.println("fUL boyut :" +driver.manage().window().getSize());

        //pencereyi istediğimiz boyut ve konuma getirelim

        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(400,500));
        System.out.println("istediğimiz konum :" +driver.manage().window().getPosition());
        System.out.println("istediğimiz boyut :" +driver.manage().window().getSize());



        Thread.sleep(3000);
        driver.close();

    }
}
