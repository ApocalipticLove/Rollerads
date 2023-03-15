package pages;

import com.codeborne.selenide.CollectionCondition;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ContactPage {

    public ContactPage openContact(){
        open("https://rollerads.com/contact.html");
        return this;
    }

    public ContactPage checkTeamList(List<String> expectedName){
        $$(".profile__name").shouldHave(CollectionCondition.texts(expectedName));
        return this;
    }
}
