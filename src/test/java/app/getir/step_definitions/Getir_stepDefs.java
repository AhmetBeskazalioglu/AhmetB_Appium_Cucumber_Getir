package app.getir.step_definitions;

import app.getir.pages.BasketPage;
import app.getir.pages.CategoryPage;
import app.getir.pages.LoginPage;
import app.getir.utilities.ScrollHelper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Getir_stepDefs {
    LoginPage loginPage=new LoginPage();
    CategoryPage categoryPage=new CategoryPage();
    BasketPage basketPage=new BasketPage();

    @When("The user opens Getir app and enters {string} and {string}")
    public void the_user_opens_Getir_app_and_enters_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user logins successfully")
    public void the_user_logins_successfully() {
        String expectedText="Dondurma";
        String actualText=categoryPage.categoryDondurma.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("The user clicks basket button")
    public void the_user_clicks_basket_button() {
        categoryPage.basketBtn.click();
    }

    @Then("The user verifies that basket is empty and able to see {string}")
    public void the_user_verifies_that_basket_is_empty_and_able_to_see(String expectedText) {
        Assert.assertEquals(expectedText,basketPage.emptyBasketText.getText());
        basketPage.backBtn.click();
    }

    @When("The user able to see all menu list in console and verifies that size is {int}")
    public void the_user_able_to_see_all_menu_list_in_console_and_verifies_that_size_is(int expectedSize) {
        int actualSize=categoryPage.menuList.size();
        Assert.assertEquals(expectedSize,actualSize);
    }

    @When("The user clicks category which is {string}")
    public void the_user_clicks_category_which_is(String categoryName) {
        categoryPage.getCategory(categoryName);
    }

    @When("The user scrolls down to items and adds {int} items")
    public void the_user_scrolls_down_to_items_and_adds_items(Integer num, DataTable dataTable) {
        List<String> list=dataTable.asList(String.class);
        for (String item: list) {
            new ScrollHelper().scrollVerticalHelper(item);
            categoryPage.addItem(num);
        }
    }

    @Then("The user verifies that {string}")
    public void the_user_verifies_that(String expectedAmount) {
        String actualAmount=categoryPage.total.getText();
        System.out.println("actualAmount = " + actualAmount);
        Assert.assertEquals(expectedAmount,actualAmount);

    }

}
