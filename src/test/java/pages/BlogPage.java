package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BlogPage {

    public static final String CAT_ITEM_1 = "About Push Notification Ads";
    public static final String CAT_ITEM_2 = "Events";
    public static final String CAT_ITEM_3 = "For Advertisers";
    public static final String CAT_ITEM_4 = "For Publishers";
    public static final String CAT_ITEM_5 = "Latest trends";
    public static final String SEARCH_TEXT = "Instagram";
    public static final String POST_TITLE = "Affiliate Marketing on Instagram";

    private SelenideElement
            blogTitle = $(byText("Blog")),
            categoriesWidgetTitle = $("#categories-2"),
            searchInput = $("input[placeholder='Search …']"),
            searchButton = $(".search-submit"),
            searchResults = $("#post-837"),
            firstNameInput = $("input[name='FNAME']"),
            userEmailInput = $("input[name='EMAIL']"),
            submitButton = $("input[name='EMAIL']");



    public BlogPage openBlog(){
        open("https://rollerads.com/");
        blogTitle.click();
        return this;
    }

    public BlogPage checkCategoriesText(){
        categoriesWidgetTitle.shouldHave(text(CAT_ITEM_1),
                text(CAT_ITEM_2),
                text(CAT_ITEM_3),
                text(CAT_ITEM_4),
                text(CAT_ITEM_5));
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
}
