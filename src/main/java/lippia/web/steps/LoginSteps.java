package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class LoginSteps extends PageSteps {

    @Given("The client is in home page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When("The client tap on My Account menu")
    public void theClientTapOnMyAccountMenu() {SuperiorBarNavigationBarService.tapAccount();
    }

    @And("The client put {string} in user input")
    public void theClientPutInUserInput(String user) {
    }

    @And("The client put {string} in password input")
    public void theClientPutInPasswordInput(String pw) {
    }

    @And("The client tap on Login")
    public void theClientTapOnLogin() { MyAccountService.tapLogin();
        
    }

    @Then("The client is in login page")
    public void theClientIsInLoginPage() {
    }

    @Then("The client can see a error message")
    public void theClientCanSeeAErrorMessage() {
    }


}
