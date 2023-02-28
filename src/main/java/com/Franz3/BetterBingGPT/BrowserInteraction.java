package com.Franz3.BetterBingGPT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInteraction {
    static WebDriver createEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
    static String browserInteraction(String url, String searchInput, WebDriver driver){
        driver.get(url);
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("bnp_btn_reject")).click();
        System.out.println("button clicked");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finding searchbox");


        //website now usable
        WebElement inputField = driver.findElement(By.id("searchbox"));
        inputField.sendKeys(searchInput);
        //inputField.submit();
        System.out.println("searchInput: " + searchInput + " send");
        try {
            Thread.sleep(30*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("text retrieved");
        return driver.findElement(By.className("ac-textBlock")).getText();
    }

}
