package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps {

    @When("The client tap on Shop menu")
    public void theClientTapOnShopMenu() {
        SuperiorBarNavigationBarService.tapShop();
    }

    @And("The client tap on HTML product category")
    public void theClientTapOnHTMLProductCategory() {
        ShopService.tapHTML();
    }

    @Then("The client can view only that particular product")
    public void theClientCanViewOnlyThatParticularProduct() {
    }


}
