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
            BlogTitle = $(byText("Blog")),
            CategoriesWidgetTitle = $("#categories-2"),
            SearchInput = $("input[placeholder='Search …']"),
            SearchButton = $(".search-submit"),
            SearchResults = $("#post-837");



    public BlogPage openBlog(){
        open("https://rollerads.com/");
        BlogTitle.click();
        return this;
    }

    public BlogPage checkCategoriesText(){
        CategoriesWidgetTitle.shouldHave(text(CAT_ITEM_1),
                text(CAT_ITEM_2),
                text(CAT_ITEM_3),
                text(CAT_ITEM_4),
                text(CAT_ITEM_5));
        return this;
    }

    public BlogPage searchPost(){
        SearchInput.setValue(SEARCH_TEXT);
        SearchButton.click();
        return this;
    }

    public BlogPage checkSearchResults(){
        SearchResults.shouldHave(text(POST_TITLE));
        return this;
    }

}
