package e3;

import java.util.HashMap;

public class MailLogin implements LoginStrategy {
    private final LoginScreen loginScreen;


    public MailLogin(LoginScreen loginScreen) {
        this.loginScreen=loginScreen;
    }

    public boolean validateId(String id) {
        if (id.contains("@")) {
            String[] trozos = id.split("@");
            return trozos[1].contains(".");
        } else {
            return false;
        }
    }

    public boolean authenticatePassword(String id, String password) {
        return password.equals(loginScreen.getMapId(id));
    }
}