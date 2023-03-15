package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;

import java.util.List;

import static io.qameta.allure.Allure.step;

public class MainPageContentTests extends TestBase{
    MainPage mainPage = new MainPage();

    @DisplayName("Отображение всех benefits")
    @Test
    void benefitListTest(){

        List<String> expectedBenefits = List.of(
                "Compared to other ad formats such as emails, banners and videos",
                "Millions of people all over the worlds engage with our ads daily",
                "Fraudsters and bots won’t stand a chance to chip off from your payout",
                "Reach the best-converting audience with a variety of targeting options",
                "Be confident in every impression and click that you get",
                "The minimum bid is only $0,001!");

        step("Открыть главную страницу Rollerads", () -> {
            mainPage.openPage();
        });
        step("Првоерить, что все преимущества отображаются", () -> {
            mainPage.checkBenefitsListText(expectedBenefits);
        });
    }

    @DisplayName("Отображение всех текстов в каруселе OnClick,In-page push,Push")
    @Test
    void aboutTabContentTest(){

        String onClickTitle = "What’s OnClick?";
        String inPagePushTitle = "What are Push Notifications?";
        String pushTitle = "What are In-Page Push notifications?";

        step("Открыть главную страницу Rollerads", () -> {
            mainPage.openPage();
        });
        step("Перейти во вкладку OnClick првоерить,что текст вкладки отобразился", () -> {
            mainPage.checkOnClickTabText(onClickTitle);
        });
        step("Перейти во вкладку In-page push првоерить, что текст вкладки отобразился", () -> {
            mainPage.checkOnPagePushTabText(inPagePushTitle);
        });
        step("Перейти во вкладку Push првоерить, что текст вкладки отобразился", () -> {
            mainPage.checkPushTabText(pushTitle);
        });
    }

    @ValueSource(strings = {
            "Visa",
            "Mastercard",
            "American Express",
            "Discover", "JCB",
            "Diners Club",
            "China UnionPay",
            "Webmoney"})
    @ParameterizedTest(name = "Проверка наличия названия платежной системы {0} в разделе Payment options")
    void paymentOptionsTest(String button) {
        step("Открыть главную страницу Rollerads", () -> {
            mainPage.openPage();
        });
        step("Проверка отображения названия платежной системы", () -> {
            mainPage.checkPaymentSystems(button);
        });
    }
}
