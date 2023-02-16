package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageContentTests extends TestBase{
    MainPage mainPage = new MainPage();

    @DisplayName("Отображение всех benefits")
    @Test
    void benefitListTest(){
        step("Открыть главную страницу Rollerads", () -> {
            mainPage.openPage();
        });
        step("Првоерить, что все преимущества отображаются", () -> {
            mainPage.checkBenefitsListText();
        });
    }

    @DisplayName("Отображение всех текстов в каруселе OnClick,In-page push,Push")
    @Test
    void aboutTabContentTest(){
        step("Открыть главную страницу Rollerads", () -> {
            mainPage.openPage();
        });
        step("Перейти во вкладку OnClick првоерить,что текст вкладки отобразился", () -> {
            mainPage.checkOnClickTabText();
        });
        step("Перейти во вкладку In-page push првоерить, что текст вкладки отобразился", () -> {
            mainPage.checkOnPagePushTabText();
        });
        step("Перейти во вкладку Push првоерить, что текст вкладки отобразился", () -> {
            mainPage.checkPushTabText();
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
