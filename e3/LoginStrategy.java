package e3;

public interface LoginStrategy {
    boolean validateId(String var1);

    boolean authenticatePassword(String var1, String var2);
}
