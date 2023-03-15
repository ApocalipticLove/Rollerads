package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CareersPage;

import java.util.List;

import static io.qameta.allure.Allure.step;

public class CareersPageContentTests extends TestBase {
    CareersPage careersPage = new CareersPage();

    List<String> expectedVacancies = List.of(
    "Business Development Manager / Remote",
    "Advertising Account Manager",
    "DevOps Engineer (Kubernetes) / Remote",
    "Senior Full Stack JavaScript Developer (Vue.js / Node.js) / Remote",
    "Senior QA Automation Engineer / Remote");

    @DisplayName("Отображение всех вакансий в разделе Careers")
    @Test
    void currentOpenings(){
        step("Открыть главную страницу Rollerads и перейти во вкладку Careers", () -> {
            careersPage.openCareers();
        });
        step("Првоерить, что все вакансии отображаются", () -> {
           careersPage.checkVacancyTitles(expectedVacancies);
        });
    }
}
