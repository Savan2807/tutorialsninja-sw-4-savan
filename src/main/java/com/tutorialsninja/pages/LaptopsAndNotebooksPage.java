package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    public By productPrice = By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//div[1]//div[2]//div[1]//p//span[@class='price-tax']");
    public By selectFilter = By.id("input-sort");
    public By sonyVAIO = By.linkText("Sony VAIO");
    public By sonyVAIOText = By.xpath("//h1[contains(text(),'Sony VAIO')]");
    public By addToCartButton = By.id("button-cart");
    public By successText = By.xpath("//div[contains(text(),'Success')]");
    public By shoppingCartButton = By.linkText("shopping cart");
    public By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    public By verifyTheTextSonyVIAO = By.linkText("Sony VAIO");
    public By changeTheQty2 = By.xpath("//input[@class='form-control']");
    public By clickOnUpdateButton = By.xpath("//i[@class='fa fa-refresh']");
    public By modifiedCartText = By.xpath("//div[contains(text(),'Success')]");
    public By verifyTheTotal = By.xpath("//tbody//tr//td[6]");
    public By clickOnCheckout = By.xpath("//a[contains(text(),'Checkout')]");
    public By verifyTheTextCheckout = By.xpath("//h1[normalize-space()='Checkout']");
    public By verifyTheTxtNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");
    public By clickOnGuestCheckout = By.xpath("//input[@value='guest']");
    public By ClickOnContinue = By.xpath("//input[@id='button-account']");
    public By firstName = By.id("input-payment-firstname");
    public By lastName = By.id("input-payment-lastname");
    public By eMail = By.id("input-payment-email");
    public By telephone = By.id("input-payment-telephone");
    public By Address1 = By.id("input-payment-address-1");
    public By city = By.id("input-payment-city");
    public By postcode = By.id("input-payment-postcode");
    public By state = By.id("input-payment-zone");
    public By clickOnCon = By.id("button-guest");
    public By continueButtonAfterComment = By.id("button-shipping-method");
    public By enterComment = By.name("comment");
    public By tickCheckBox = By.xpath("//input[@name='agree']");
    public By continueClicking = By.xpath("//input[@id='button-payment-method']");
    public By orderPlacedText = By.xpath("//h1[text()='Your order has been placed!']");
    public By confirmButton = By.id("button-confirm");

    public List<Double> getProductPricesInDefaultFilterAndSortByDescendingOrder() {
        return convertPriceListToReverse(productPrice);
    }

    //Get list after applying filter
    public List<Double> getProductPriceAfterFilterHighToLow() {
        return afterFilterPrice(productPrice);
    }

    //Clear box and send text method
    public void clearAndSendText(By by, String value) {
        driver.findElement(by).clear();
        sendTextToElement(by, value);
    }

    //Get attribute method
    public String getAttribute(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    public void clickOn(By by) {
        clickOnElement(by);
    }

    //Get text method
    public String getVerificationText(By by) {
        return getTextFromElement(by);
    }

    //Select from dropdown method
    public void select(By by, String value) {
        selectByValueFromDropDown(by, value);
    }

    public String setVerifyTheTextSonyVIAO() {
        return getTextFromElement(verifyTheTextSonyVIAO);
    }

    public void changeTheQty2() {
        driver.findElement(changeTheQty2).clear();
        sendTextToElement(changeTheQty2, "2");
    }

    public void clickOnUpdateButton() {
        clickOnElement(clickOnUpdateButton);
    }

    public String verifyUpdatedCart() {
        return getTextFromElement(modifiedCartText).substring(0, 46);
    }


    public String verifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    public void clickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }

    public String verifyTheTextCheckout() {
        return getTextFromElement(verifyTheTextCheckout);
    }

    public String verifyTheTextNewCustomer() {
        return getTextFromElement(verifyTheTxtNewCustomer);
    }

    public void clickOnGuestCheckout() {
        clickOnElement(clickOnGuestCheckout);
    }

    public void clickOnContinue() {
        clickOnElement(ClickOnContinue);
    }

    public void enterFirstName() {
        sendTextToElement(firstName, "Savan");
    }

    public void enterLastName() {
        sendTextToElement(lastName, "Kakadiya");
    }

    public void enterEmail() {
        sendTextToElement(eMail, "savan2898@gmail.com");
    }

    public void enterTelephone() {
        sendTextToElement(telephone, "07999555999");
    }

    public void enterAddress1() {
        sendTextToElement(Address1, "70 buller");
    }

    public void enterCity() {
        sendTextToElement(city, "Leicester");
    }

    public void enterPostcode() {
        sendTextToElement(postcode, "LE45GA");
    }


    public void enterState() {
        selectByValueFromDropDown(state, "3525");
    }

    public void clickOnContinueButton() {
        clickOnElement(clickOnCon);
    }

    public void enterComment() {
        sendTextToElement(enterComment, "Mackbook is out of order");
    }

    public void clickOnContinueAfterComment() {
        clickOnElement(continueButtonAfterComment);
    }

    public void clickCheckBox() {
        clickOnElement(tickCheckBox);
    }

    public void setContinueClicking() {
        clickOnElement(continueClicking);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String verifyOrderPlaced() {
        return getTextFromElement(orderPlacedText);
    }
}
