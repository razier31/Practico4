package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;

import static lippia.web.constants.SuperiorNavigationBarConstants.LOGIN_BUTTON;

public class MyAccountService {
    public static void tapLogin() {
        WebActionManager.click(LOGIN_BUTTON);
    }
}
