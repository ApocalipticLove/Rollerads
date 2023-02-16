package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.BlogPage;

import static io.qameta.allure.Allure.step;

public class BlogPageContentTests extends TestBase {

    BlogPage blogPage = new BlogPage();

    @DisplayName("Отображение всех категорий в разделе Blog")
    @Test
    void blogCategoriesTest(){
        step("Открыть главную страницу Rollerads и перейти во вкладку Blog", () -> {
            blogPage.openBlog();
        });
        step("Првоерить, что все категории отображаются", () -> {
            blogPage.checkCategoriesText();
        });
    }
}
