package e3;

import java.util.HashMap;

public class SmartphoneLogin implements LoginStrategy {
    private final LoginScreen loginScreen;


    public SmartphoneLogin(LoginScreen loginScreen) {
        this.loginScreen=loginScreen;
    }

    public boolean validateId(String id) {
        return isNumeric(id) && id.length() == 9;
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