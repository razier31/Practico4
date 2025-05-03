package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.PracticeHomeService;

public class PracticeHomeSteps extends PageSteps {

//    @Given("^The client is on google page$")
//    public void home() {
//        GoogleHomeService.navegarWeb();
//    }
//
//    @Given("^The client isn't on google page$")
//    public void isNotHome() {
//        GoogleHomeService.navegarWeb();
//        throw new RuntimeException("the client is not on google page");
//    }
//
//    @When("^The client search for word (.*)$")
//    public void search(String criteria) {
//        GoogleHomeService.enterSearchCriteria(criteria);
//        GoogleHomeService.clickSearchButton();
//    }
//
//    @Then("The client verify that results are shown properly")
//    public void statVerification() {
//        GoogleSearchResultService.verifyResults();
//    }

    @Given("Ingreso a la pagina de practica")
    public void ingresoALaPaginaDePractica() {
        PracticeHomeService.navegarWeb();
    }

    @When("Realizo click en shop")
    public void realizoClickEnNewArrivals() {
        PracticeHomeService.clickShopButton();
    }

    @Then("Se muestra la pagina de shop")
    public void seMuestraLaPaginaDeShop() {
        PracticeHomeService.verificarShopPage();
    }
}
