package pages;

import com.codeborne.selenide.CollectionCondition;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class CareersPage {

    public CareersPage openCareers(){
        open("https://rollerads.jobspage.co/");
        return this;
    }

    public CareersPage checkVacancyTitles(List<String> expectedVacancies){
        $$("h2").shouldHave(CollectionCondition.texts(expectedVacancies));
        return this;
    }

}
