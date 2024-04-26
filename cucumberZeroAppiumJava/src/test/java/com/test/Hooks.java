package com.test;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    private static AppiumDriver<?> driver;

    public static AppiumDriver<?> validateDriver() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\maxia\\Documents\\Automacao_java_com_APPIUM\\cucumberZeroAppiumJava\\apps\\bibliamax.apk");
        capabilities.setCapability("deviceName", "POCO X3 Pro");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;
    }

    public static AppiumDriver<?> getDriver(){

        return getDriver();

    }

    public static void quitDriver() {

        if (driver != null){
            driver.quit();
        }
    }

    @Before
    public static void startProject() throws MalformedURLException{
        if (getDriver() != null) {
            getDriver().launchApp();
        } else{
            validateDriver();
        }
    }
}
