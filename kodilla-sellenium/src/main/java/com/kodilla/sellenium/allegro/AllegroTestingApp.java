package com.kodilla.sellenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement getRidOffPopUp = driver.findElement(By.xpath("//button[@class=\"_13q9y _8hkto m0t1_f9 mg9e_0 mvrt_0 mj7a_0 mh36_0 mt3o_0 mp7g_f6 mq1m_0 mnjl_0\"]"));
        getRidOffPopUp.click();
        Thread.sleep(1000);

        WebElement searchCombo = driver.findElement(By.xpath("//*[@class=\"_r65gb mp7g_oh\"]/select"));
        Select select = new Select(searchCombo);
        select.selectByValue("/kategoria/elektronika");
        Thread.sleep(1000);

        WebElement allegroInput = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        allegroInput.sendKeys("mavic mini");
        Thread.sleep(1000);

        WebElement allegroButton = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/button"));
        allegroButton.click();
        Thread.sleep(1000);

        Thread.sleep(15000);
        driver.close();

    }
}
