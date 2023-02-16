package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactPage {

    public static final String PROFILE_NAME_1 = "Andrey Veselov";
    public static final String PROFILE_NAME_2 = "Eugene Bezrodnyy";
    public static final String PROFILE_NAME_3 = "Alexander Akkaev";

    private SelenideElement
    ContactTitle = $(byText("Contact")),
    Profile1 = $(byTagAndText("h3", "Andrey Veselov")),
    Profile2 = $(byTagAndText("h3", "Eugene Bezrodnyy")),
    Profile3 = $(byTagAndText("h3", "Alexander Akkaev"));

    public ContactPage openContact(){
        open("https://rollerads.com/");
        ContactTitle.click();
        return this;
    }
    public ContactPage checkTeamList(){
        Profile1.shouldHave(text(PROFILE_NAME_1));
        Profile2.shouldHave(text(PROFILE_NAME_2));
        Profile3.shouldHave(text(PROFILE_NAME_3));
        return this;
    }
}
