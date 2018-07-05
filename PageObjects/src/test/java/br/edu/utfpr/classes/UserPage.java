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
public class UserPage extends BasePage{

    public UserPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div[3]/div[1]/span")
    WebElement user;
    
    @FindBy(id = "SummonerRefreshButton")
    WebElement atualizarDados;
    
    
    public void atualizarDados() {
       atualizarDados.click();  
    }
    
    public String getUser() {
        return user.getText();
    }
    
}
