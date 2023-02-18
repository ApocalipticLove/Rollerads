package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.BlogPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class BlogPageSearchAndSubscribeTests extends TestBase {

    BlogPage blogPage = new BlogPage();
    Faker faker = new Faker();

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

    @DisplayName("Заполнение и отправка формы подписки на рассылку")
    @Test
    void subscribeTest(){

        String userName = faker.name().firstName();
        String userEmail = faker.internet().emailAddress();

        step("Открыть главную страницу Rollerads и перейти во вкладку Blog", () -> {
            blogPage.openBlog();
        });
        step("Ввод имени пользователя", () -> {
            blogPage.setFirstName(userName);
        });
        step("Ввод почты пользователя", () -> {
            blogPage.setEmail(userEmail);;
        });
        step("Отправка формы", () -> {
            blogPage.getSubmit();
        });
        step("Отправка формы", () -> {
            blogPage.checkSubscribeResult();
        });
    }
}
