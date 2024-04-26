package org.example.primeiroprojetojavaappium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class TesteLoginDeviceFarm {



    private static ScreenLogin screen;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void capabilities() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("projectName", "primeiro_projeto");
        browserstackOptions.put("sessionName", "testeLogin");
        browserstackOptions.put("appiumVersion", "2.4.1");


        capabilities.setCapability("browserstack.user","maxianmuller_zTYjvi");
        capabilities.setCapability("browserstack.key","Q4h5f2BnxPMBHuJeTarA");

        capabilities.setCapability("app", "bs://71f217b2f4ec4a146a925053e2e398af234af340");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Google Pixel 3");


        driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), capabilities);

        //capabilities.setCapability("deviceName", "Xiaomi Redmi Note 9S");
        //capabilities.setCapability("platFormName", "Android");
       // capabilities.setCapability("unicodeKeyboard", true);
        //driver = new AndroidDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        screen = new ScreenLogin(driver);

    }

    @Test
    public void testeLogin(){
        screen.abrir();
        screen.buscarHino("345");
    }
}
