package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ContactPage;

import java.util.List;

import static io.qameta.allure.Allure.step;

public class ContactPageContentTests extends TestBase {

    ContactPage contactPage = new ContactPage();

    List<String> expectedName = List.of(
            "Andrey Veselov",
            "Eugene Bezrodnyy",
            "Alexander Akkaev");

    @DisplayName("Отображение всех имен и фамилий в разделе Contact")
    @Test
    void contactListTest(){
        step("Открыть главную страницу Rollerads и перейти во вкладку Contact", () -> {
            contactPage.openContact();
        });
        step("Првоерить, что все имена отображаются", () -> {
            contactPage.checkTeamList(expectedName);
        });
    }
}
