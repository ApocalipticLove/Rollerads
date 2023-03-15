package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BlogPage {

    private SelenideElement
            searchInput = $("input[placeholder='Search …']"),
            searchButton = $(".search-submit"),
            searchResults = $("#post-837"),
            firstNameInput = $("input[name='FNAME']"),
            userEmailInput = $("input[name='EMAIL']"),
            submitButton = $("input[name='EMAIL']");

    public BlogPage openBlog(){
        open("https://blog.rollerads.com/");
        return this;
    }

    public BlogPage searchPost(String searchText){
        searchInput.setValue(searchText);
        searchButton.click();
        return this;
    }

    public BlogPage checkSearchResults(String postTitle){
        searchResults.shouldHave(text(postTitle));
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

    public BlogPage clickSubmitButton() {
        submitButton.click();
        return this;
    }
}
