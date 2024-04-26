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
import java.util.Locale;

public class TesteLogin {

    private static ScreenLogin screen;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void capabilities() throws MalformedURLException{

        DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", new File("apps/bibliamax.apk"));
            capabilities.setCapability("deviceName", "Xiaomi Redmi Note 9S");
            capabilities.setCapability("platFormName", "Android");
            capabilities.setCapability("unicodeKeyboard", false);
            driver = new AndroidDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
            screen = new ScreenLogin(driver);

        }

    @Test
    public void testeLogin(){
        screen.abrir();
        screen.buscarHino("345");
    }

}
