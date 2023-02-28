package com.Franz3.BetterBingGPT;

import org.openqa.selenium.WebDriver;

import static com.Franz3.BetterBingGPT.BrowserInteraction.browserInteraction;
import static com.Franz3.BetterBingGPT.BrowserInteraction.createEdgeDriver;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.bing.com/search?q=Bing+AI&showconv=1&FORM=hpcodx";
        String searchInput = "test run";
        WebDriver driver = createEdgeDriver();
        
        System.out.println(browserInteraction(url, searchInput, driver));
        driver.quit();
    }
}
