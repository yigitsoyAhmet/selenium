package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));;

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");
        //2- Add Element butonuna basin
        WebElement addElementButonu=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButonu.click();
        Thread.sleep(3000);

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        }else{
            System.out.println("delete butonu testi FAILED");
        }
        Thread.sleep(3000);
        //4- Delete tusuna basin
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addElementsElementi=driver.findElement(By.xpath("//h3"));

        if (addElementsElementi.isDisplayed()){
            System.out.println("add element  testi PASSED");
        }else{
            System.out.println("add elementi testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
