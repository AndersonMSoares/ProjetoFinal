/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author MarkVII
 */
public class ChampPage extends BasePage{

    public ChampPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[1]/div/div[2]/h1")
    WebElement champName;
    
    public String getNameChamp(){
        return champName.getText();
    }
    
}
