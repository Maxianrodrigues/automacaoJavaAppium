package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenLogin extends BaseScreen{

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

