import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class rolleradsTests extends TestBase{
    @DisplayName("Отображение всех benefits")
    @Test
    void benefitListTest(){
    step("Открыть главную страницу Rollerads", () -> {
        open("https://rollerads.com/");
    });
    step("Првоерить, что все преимущества отображаются", () -> {
        $(".benefits__list").shouldHave(text("Compared to other ad formats such as emails, banners and videos"));
        $(".benefits__list").shouldHave(text("Millions of people all over the worlds engage with our ads daily"));
        $(".benefits__list").shouldHave(text("Reach the best-converting audience with a variety of targeting options"));
        $(".benefits__list").shouldHave(text("Be confident in every impression and click that you get"));
        $(".benefits__list").shouldHave(text("The minimum bid is only $0,001!"));
    });
}
    @DisplayName("Отображение всех вакансий в разделе Careers")
    @Test
    void currentOpenings(){
    step("Открыть главную страницу Rollerads", () -> {
        open("https://rollerads.com/");
    });
    step("Перейти во вкладку Careers", () -> {
        $(byText("Careers")).click();
    });
    step("Првоерить, что все вакансии отображаются", () -> {
        $(byTagAndText("h2", "Business Development Manager / Remote")).shouldHave(text("Business Development Manager / Remote"));
        $(byTagAndText("h2", "Advertising Account Manager")).shouldHave(text("Advertising Account Manager"));
        $(byTagAndText("h2", "DevOps Engineer (Kubernetes) / Remote")).shouldHave(text("DevOps Engineer (Kubernetes) / Remote"));
        $(byTagAndText("h2", "Senior Full Stack JavaScript Developer (Vue.js / Node.js) / Remote")).shouldHave(text("Senior Full Stack JavaScript Developer (Vue.js / Node.js) / Remote"));
        $(byTagAndText("h2", "Senior QA Automation Engineer / Remote")).shouldHave(text("Senior QA Automation Engineer / Remote"));
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
        open("https://rollerads.com/");
    });
    step("Првоерить, что все платежные системы отображаются", () -> {
        $(".card-brands").shouldHave(text(button));
    });
}
    @DisplayName("Отображение всех категорий в разделе Blog")
    @Test
    void blogCategoriesTest(){
    step("Открыть главную страницу Rollerads", () -> {
        open("https://rollerads.com/");
    });
    step("Перейти во вкладку Blog", () -> {
        $(byText("Blog")).click();
    });
    step("Првоерить, что все категории отображаются", () -> {
        $("#categories-2").shouldHave(text("About Push Notification Ads"));
        $("#categories-2").shouldHave(text("Events"));
        $("#categories-2").shouldHave(text("For Advertisers"));
        $("#categories-2").shouldHave(text("For Publishers"));
        $("#categories-2").shouldHave(text("Latest trends"));
    });
}
    @DisplayName("Отображение всех имен и фамилий в разделе Contact")
    @Test
    void contactListTest(){
    step("Открыть главную страницу Rollerads", () -> {
        open("https://rollerads.com/");
    });
    step("Перейти во вкладку Contact", () -> {
        $(byText("Contact")).click();
    });
    step("Првоерить, что все имена отображаются", () -> {
        $(byTagAndText("h3", "Andrey Veselov")).shouldHave(text("Andrey Veselov"));
        $(byTagAndText("h3", "Eugene Bezrodnyy")).shouldHave(text("Eugene Bezrodnyy"));
        $(byTagAndText("h3", "Alexander Akkaev")).shouldHave(text("Alexander Akkaev"));
    });
    }
}

