package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public static final String HIGH_CTR_TITLE = "Compared to other ad formats such as emails, banners and videos";
    public static final String GLOBAL_REACH_TITLE = "Millions of people all over the worlds engage with our ads daily";
    public static final String ANTIFRAUD_SYSTEM_TITLE = "Fraudsters and bots won’t stand a chance to chip off from your payout";
    public static final String SMART_TARGETING_TITLE = "Reach the best-converting audience with a variety of targeting options";
    public static final String REAL_TRAFFIC_TITLE = "Be confident in every impression and click that you get";
    public static final String LOW_COST_TITLE = "The minimum bid is only $0,001!";
    public static final String ON_CLICK_TITLE = "What’s OnClick?";
    public static final String PUSH_TITLE = "What are Push Notifications?";
    public static final String IN_PAGE_PUSH_TITLE = "What are In-Page Push notifications?";

    private SelenideElement
            benefitsList = $(".benefits__list"),
            aboutTab2 = $("#about_tab_2"),
            onClickTab = $(byTagAndText("h3", "What’s OnClick?")),
            aboutTab3 = $("#about_tab_3"),
            inPagePushTab = $(byTagAndText("h3", "What are In-Page Push notifications?")),
            aboutTab1 = $("#about_tab_1"),
            pushTab =  $(byTagAndText("h3", "What are Push Notifications?")),
            cardBrands = $(".card-brands");

    public MainPage openPage() {
        open("https://rollerads.com/");
        executeJavaScript("$('.cookie').remove()");
        return this;
    }

    public MainPage checkBenefitsListText() {
        benefitsList.shouldHave(text(HIGH_CTR_TITLE),
                                text(GLOBAL_REACH_TITLE),
                                text(ANTIFRAUD_SYSTEM_TITLE),
                                text(SMART_TARGETING_TITLE),
                                text(REAL_TRAFFIC_TITLE),
                                text(LOW_COST_TITLE));
        return this;
    }

    public MainPage checkOnClickTabText() {
        aboutTab2.hover().click();
        onClickTab.shouldHave(text(ON_CLICK_TITLE));
        return this;
    }

    public MainPage checkOnPagePushTabText(){
        aboutTab3.hover().click();
        inPagePushTab.shouldHave(text(IN_PAGE_PUSH_TITLE));
        return this;
    }

    public MainPage checkPushTabText() {
        aboutTab1.hover().click();
        pushTab.shouldHave(text(PUSH_TITLE));
        return this;
    }

    public MainPage checkPaymentSystems(String button) {
        cardBrands.shouldHave(text(button));
        return this;
    }
}
