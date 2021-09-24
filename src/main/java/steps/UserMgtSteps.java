package steps;

import impl.UserMgtImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class UserMgtSteps {
    UserMgtImpl impl = new UserMgtImpl();

    @When("I open User-Mgt page")
    public void i_open_user_mgt_page() {
        impl.getPage().userMgtLink.click();
    }

    @Then("Title of the page should be Register New User")
    public void title_of_the_page_should_be_register_new_user() {
        Assert.assertEquals("Register New User", WebDriverUtils.getDriver().getTitle());
    }

    @Then("I should see Login button")
    public void i_should_see_login_button() {
        Assert.assertTrue(impl.getPage().loginBtn.isEnabled());
    }

    @Then("I should see Access DB button")
    public void i_should_see_access_db_button() {
        Assert.assertTrue(impl.getPage().accessDbBtn.isEnabled());
    }

    @And("I open Access DB page")
    public void iOpenAccessDBPage() {
        impl.openLinkInNewWindowAndSwitch("Access DB");
    }

    @Then("I should see title of the page is User DB")
    public void iShouldSeeTitleOfUserDB() {
        Assert.assertEquals("User DB",WebDriverUtils.getDriver().getTitle());
    }

    @When("I open Login page")
    public void iOpenLoginPage() {
        impl.openLinkInNewWindowAndSwitch("LOGIN");
    }

    @Then("I should see title of the page is Login Page")
    public void iShouldSeeTitleOfLoginPage() {
        Assert.assertEquals("Login Page",WebDriverUtils.getDriver().getTitle());
    }

    @Then("tla image is loaded")
    public void tlaImageIsLoaded() {
        Assert.assertTrue(impl.getPage().image.isDisplayed());
    }
}
