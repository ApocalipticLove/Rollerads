package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CareersPage;

import static io.qameta.allure.Allure.step;

public class CareersPageContentTests extends TestBase {
    CareersPage careersPage = new CareersPage();

    @DisplayName("Отображение всех вакансий в разделе Careers")
    @Test
    void currentOpenings(){
        step("Открыть главную страницу Rollerads и перейти во вкладку Careers", () -> {
            careersPage.openCareers();
        });
        step("Првоерить, что все вакансии отображаются", () -> {
           careersPage.checkVacancyText();
        });
    }
}
