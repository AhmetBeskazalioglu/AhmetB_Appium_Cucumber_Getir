package app.getir.step_defs;

import app.getir.pages.CategoryPage;
import app.getir.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Getir_StepDefs {
    LoginPage loginPage = new LoginPage();
    CategoryPage categoryPage = new CategoryPage();

    @When("The user opens Getir app and enters {string} and {string}")
    public void the_user_opens_Getir_app_and_enters_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user logins successfully")
    public void the_user_logins_successfully() {
        String expected = "Dondurma";
        String actual = categoryPage.getCategory("Dondurma");
    }

    @When("The user clicks basket button")
    public void the_user_clicks_basket_button() {
    }

    @Then("The user verifies that basket is empty and able to see {string}")
    public void the_user_verifies_that_basket_is_empty_and_able_to_see(String string) {
    }

    @When("The user able to see all menu list in console and verifies that size is {int}")
    public void the_user_able_to_see_all_menu_list_in_console_and_verifies_that_size_is(int string) {
    }

    @When("The user clicks category which is {string}")
    public void the_user_clicks_category_which_is(String string) {
    }

    @When("The user scrolls down to items and adds {int} items")
    public void the_user_scrolls_down_to_items_and_adds_items(Integer int1, io.cucumber.datatable.DataTable dataTable) {
    }

    @Then("The user verifies that {string}")
    public void the_user_verifies_that(String string) {
    }
}
