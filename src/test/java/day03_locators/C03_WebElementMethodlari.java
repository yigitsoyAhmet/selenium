package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

      WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        System.out.println(aramaKutusuElementi.isDisplayed());//gorunuyor mu? true/false
        System.out.println(aramaKutusuElementi.isEnabled());//ulasılabliyor mu? true/false

        System.out.println(aramaKutusuElementi.getText());//elementin uzerinde yazı varsa getirir.

        aramaKutusuElementi.sendKeys("Nutella");
        Thread.sleep(2000);
        aramaKutusuElementi.clear();

        System.out.println(aramaKutusuElementi.getSize());//(912,38)

        System.out.println(aramaKutusuElementi.getSize().height);//(38)

        System.out.println(aramaKutusuElementi.getTagName());//locate ettigimiz elementin tagnameini getirir
        System.out.println(aramaKutusuElementi.getAttribute("class"));//class attribute degeri
        System.out.println(aramaKutusuElementi.getLocation());//konum olarak nerde (325,11)
        System.out.println(aramaKutusuElementi.getRect().getDimension());//(912,38)


        Thread.sleep(3000);
        driver.close();
    }
}
