package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private ElementsCollection benefitsList = $$(".benefits__item");
    private SelenideElement aboutTab2 = $("#about_tab_2");
    private SelenideElement onClickTab = $(byTagAndText("h3", "What’s OnClick?"));
    private SelenideElement aboutTab3 = $("#about_tab_3");
    private SelenideElement inPagePushTab = $(byTagAndText("h3", "What are In-Page Push notifications?"));
    private SelenideElement aboutTab1 = $("#about_tab_1");
    private SelenideElement pushTab =  $(byTagAndText("h3", "What are Push Notifications?"));
    private SelenideElement cardBrands = $(".card-brands");

    public MainPage openPage() {
        open("https://rollerads.com/");
        executeJavaScript("$('.cookie').remove()");
        return this;
    }

    public MainPage checkBenefitsListText(List<String> expectedBenefits) {
        benefitsList.shouldHave(CollectionCondition.texts(expectedBenefits));
        return this;
    }

    public MainPage checkOnClickTabText(String onClickTitle) {
        aboutTab2.hover().click();
        onClickTab.shouldHave(text(onClickTitle));
        return this;
    }

    public MainPage checkOnPagePushTabText(String inPagePushTitle){
        aboutTab3.hover().click();
        inPagePushTab.shouldHave(text(inPagePushTitle));
        return this;
    }

    public MainPage checkPushTabText(String pushTitle) {
        aboutTab1.hover().click();
        pushTab.shouldHave(text(pushTitle));
        return this;
    }

    public MainPage checkPaymentSystems(String button) {
        cardBrands.shouldHave(text(button));
        return this;
    }
}
