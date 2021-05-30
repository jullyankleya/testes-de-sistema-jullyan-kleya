package org.automacao.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
    // Espera implicita
    private final WebDriverWait wait;
    private static final int WAIT_TIMEOUT = 30;

    public GenericMethods() {
        WebDriver driver = Hooks.getDriver();
        this.wait = new WebDriverWait(driver, WAIT_TIMEOUT);
    }

    public static void waitPageLoad() {
        WebDriver driver = Hooks.getDriver();
        new WebDriverWait(driver, WAIT_TIMEOUT).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

    // Espera explicita
    public void waitForVisibleElement(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForTextToBePresentInElement(WebElement webElement, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
    }

    public void waitForClickableElement(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
