package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BlogPage {

    public static final String SEARCH_TEXT = "Instagram";
    public static final String POST_TITLE = "Affiliate Marketing on Instagram";
    public static final String SUBSCRIBE_RESPONSE_TEXT = "Oops. Something went wrong. Please try again later.";

    private SelenideElement
            blogTitle = $(byText("Blog")),
            searchInput = $("input[placeholder='Search …']"),
            searchButton = $(".search-submit"),
            searchResults = $("#post-837"),
            firstNameInput = $("input[name='FNAME']"),
            userEmailInput = $("input[name='EMAIL']"),
            submitButton = $("input[name='EMAIL']"),
            subscribeResponse = $(".mc4wp-response");

    public BlogPage openBlog(){
        open("https://rollerads.com/");
        blogTitle.click();
        return this;
    }

    public BlogPage searchPost(){
        searchInput.setValue(SEARCH_TEXT);
        searchButton.click();
        return this;
    }

    public BlogPage checkSearchResults(){
        searchResults.shouldHave(text(POST_TITLE));
        return this;
    }
    public BlogPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public BlogPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public BlogPage getSubmit() {
        submitButton.click();
        return this;
    }
    public BlogPage checkSubscribeResult() {
        subscribeResponse.shouldHave(text(SUBSCRIBE_RESPONSE_TEXT));
        return this;
    }
}
