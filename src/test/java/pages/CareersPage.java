package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CareersPage {

    public static final String VACANCY_1_TITLE = "Business Development Manager / Remote";
    public static final String VACANCY_2_TITLE = "Advertising Account Manager";
    public static final String VACANCY_3_TITLE = "DevOps Engineer (Kubernetes) / Remote";
    public static final String VACANCY_4_TITLE = "Senior Full Stack JavaScript Developer (Vue.js / Node.js) / Remote";
    public static final String VACANCY_5_TITLE = "Senior QA Automation Engineer / Remote";
    private SelenideElement
            careersTitle = $(byText("Careers")),
            vacancy1 = $(byTagAndText("h2", "Business Development Manager / Remote")),
            vacancy2 = $(byTagAndText("h2", "Advertising Account Manager")),
            vacancy3 = $(byTagAndText("h2", "DevOps Engineer (Kubernetes) / Remote")),
            vacancy4 = $(byTagAndText("h2", "Senior Full Stack JavaScript Developer (Vue.js / Node.js) / Remote")),
            vacancy5 = $(byTagAndText("h2", "Senior QA Automation Engineer / Remote"));

    public CareersPage openCareers(){
        open("https://rollerads.com/");
        careersTitle.click();
        return this;
    }

    public CareersPage checkVacancyText(){
        vacancy1.shouldHave(text(VACANCY_1_TITLE));
        vacancy2.shouldHave(text(VACANCY_2_TITLE));
        vacancy3.shouldHave(text(VACANCY_3_TITLE));
        vacancy4.shouldHave(text(VACANCY_4_TITLE));
        vacancy5.shouldHave(text(VACANCY_5_TITLE));
        return this;
    }
}
