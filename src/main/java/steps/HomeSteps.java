package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    @Given("I navigate to homepage")
    public void i_navigate_to_homepage() {
        HomeImpl impl = new HomeImpl();
        impl.navigateToHomepage();
    }
    @Then("I should be able to see Saucedemo link text")
    public void i_should_be_able_to_see_saucedemo_link_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click Saucedemo link text")
    public void i_click_saucedemo_link_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see Swag Labs title")
    public void i_should_see_swag_labs_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
