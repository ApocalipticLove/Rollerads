package drivers;

import com.codeborne.selenide.Configuration;
import config.Project;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {
    public static void configure(){
        Configuration.baseUrl = Project.config.baseUrl();
        Configuration.browserSize = Project.config.browserSize();
        Configuration.browser = Project.config.browser();
        Configuration.browserVersion = Project.config.browserVersion();

        Configuration.remote = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

    }
}
