package org.example.primeiroprojetojavaappium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;


public class ScreenLogin {
    //metodo para as telas de login


    //metodo para pegar o appium do driver para inicializar os elementos
    //identificando os elementos e plataformas
    public ScreenLogin(AppiumDriver<RemoteWebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="devandroid.muller.bibliasagrada:id/imgBiblia")
    private RemoteWebElement botaobiblia;

    @AndroidFindBy(id="devandroid.muller.bibliasagrada:id/imgHinario")
    private RemoteWebElement botaohinario;


    @AndroidFindBy(id="devandroid.muller.bibliasagrada:id/editBuscaId")
    private RemoteWebElement campodebuscahino;




    public void abrir() {
        botaohinario.click();
    }

    public void buscarHino(String codigoHino) {
        campodebuscahino.sendKeys(codigoHino);
    }
}
