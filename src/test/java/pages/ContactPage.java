package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContactPage {

//    public static final String PROFILE_NAME_1 = "Andrey Veselov";
//    public static final String PROFILE_NAME_2 = "Eugene Bezrodnyy";
//    public static final String PROFILE_NAME_3 = "Alexander Akkaev";
//
//    private SelenideElement
//    profile1 = $(byTagAndText("h3", "Andrey Veselov")),
//    profile2 = $(byTagAndText("h3", "Eugene Bezrodnyy")),
//    profile3 = $(byTagAndText("h3", "Alexander Akkaev"));

    public ContactPage openContact(){
        open("https://rollerads.com/contact.html");
        return this;
    }
//    public ContactPage checkTeamList(){
//        profile1.shouldHave(text(PROFILE_NAME_1));
//        profile2.shouldHave(text(PROFILE_NAME_2));
//        profile3.shouldHave(text(PROFILE_NAME_3));
//        return this;
//    }

    public ContactPage checkTeamList(List<String> expectedName){
        $$("h3").shouldHave(CollectionCondition.texts(expectedName));
        return this;
    }
}
