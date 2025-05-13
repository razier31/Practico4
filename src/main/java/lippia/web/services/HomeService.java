package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.isPresent;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.PracticeHomeConstants.CONTAINER_SLIDER;

public class HomeService {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShopButton() {
        click(PracticeHomeConstants.BUTTON_SHOP_XPATH);
    }

    public static void verificarShopPage() {
        Assert.assertTrue(isPresent(PracticeHomeConstants.ORDERBY_XPATH));
    }

    public static void checkSlider(int qsliders) {
        Assert.assertTrue(WebActionManager.getElements(PracticeHomeConstants.CONTAINER_SLIDER).size() == qsliders);
    }
}
