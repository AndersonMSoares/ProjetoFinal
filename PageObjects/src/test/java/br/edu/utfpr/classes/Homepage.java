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
public class Homepage extends BasePage{
    
    @FindBy(name = "userName")
    WebElement user;
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/button[1]")
    WebElement buscar;
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[2]/a")
    WebElement analise;

    public Homepage(WebDriver driver) {
        super(driver);
    } 
    public UserPage getUser() {
        buscar.click();
        return new UserPage(driver);
    }
    
    public void setUserSearch(String a){
        user.sendKeys(a);
    }
    public AnalisePage getAnalise(){
        analise.click();
        return new AnalisePage(driver);
    }
}
