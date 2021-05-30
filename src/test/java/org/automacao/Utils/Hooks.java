package org.automacao.Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            driver.get("https://loja.chillibeans.com.br/");
            driver.manage().window().maximize();
            Hooks.setDriver(driver);
        }
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Hooks.driver = driver;
    }

    @After
    public static void teardown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }
}
