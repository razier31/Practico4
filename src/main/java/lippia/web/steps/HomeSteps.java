package lippia.web.steps;

import io.cucumber.java.en.Then;
import lippia.web.services.HomeService;

public class HomeSteps {
    @Then("The client can view only {int} sliders")
    public void theClientCanViewOnlySliders(int qsliders) {
        HomeService.checkSlider(qsliders);
    }
}
