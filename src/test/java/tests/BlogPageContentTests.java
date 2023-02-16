package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.BlogPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
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

    @DisplayName("Поиск поста в блоге по ключевому слову")
    @Test
    void blogCSearchTest(){
        step("Открыть главную страницу Rollerads и перейти во вкладку Blog", () -> {
            blogPage.openBlog();
        });
        step("Вводим значение в поле поиска", () -> {
            blogPage.searchPost();
        });
        step("Проверяем результат поиска", () -> {
            blogPage.checkSearchResults();
        });
    }
}
