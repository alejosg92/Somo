package com.somo.test.automation.herokuapp.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class ChromeDriver {

    private WebDriver driver;
    private static List<ChromeDriver> listChromeDriver = new ArrayList<ChromeDriver>();


    public static ChromeDriver chrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized --disable-infobars --ignore-certificate-errors --disable-extensions --disable-web-security --test-type --no-sandbox --disable-popup-blocking --disable-default-apps --file-access-check --disable-gpu --disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
        listChromeDriver.add(new ChromeDriver());
        listChromeDriver.get(listChromeDriver.size()-1).driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        listChromeDriver.get(listChromeDriver.size()-1).driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return listChromeDriver.get(listChromeDriver.size()-1);
    }

    public WebDriver withURL(String url){
        driver.get(url);
        return listChromeDriver.get(listChromeDriver.size()-1).driver;
    }

}
