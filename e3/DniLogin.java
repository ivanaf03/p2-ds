package e3;

import java.util.HashMap;

public class DniLogin implements LoginStrategy {
    private final LoginScreen loginScreen;


    public DniLogin(LoginScreen loginScreen) {
        this.loginScreen=loginScreen;
    }

    public boolean validateId(String id) {
        if (id.length() == 9) {
            return isNumeric(id.substring(0, 8)) && id.substring(8, 9).matches("[A-Z]*");
        } else {
            return false;
        }
    }

    public boolean authenticatePassword(String id, String password) {
        return password.equals(loginScreen.getMapId(id));
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException var2) {
            return false;
        }
    }
}