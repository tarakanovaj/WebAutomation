package com.cnn.pages;

import common.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {
  @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[6]/div[1]/*[1]")
    WebElement userAccount ;

  @FindBy(xpath = "//input[@name='loginEmail']")
  WebElement emailAddress;

    @FindBy(xpath = "//input[@name='loginPassword']")
    WebElement password;

   @FindBy(css = "button#login-form-button")
   WebElement loginButton;



  public void VerifyLoginPage(){
    userAccount.click();
    emailAddress.sendKeys("Tommy123@gmail.com");
    password.sendKeys("123456");
    loginButton.click();

  }



}
