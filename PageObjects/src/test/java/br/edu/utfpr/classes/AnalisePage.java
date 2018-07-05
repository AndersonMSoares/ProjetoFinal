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

public class AnalisePage extends BasePage{

    public AnalisePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[110]/a/div[1]/i")
    WebElement champ;
    
    public ChampPage getChamp(){
        champ.click();
        return new ChampPage(driver);
    }
    
}
