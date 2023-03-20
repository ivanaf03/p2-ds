package e3;

public class LetrasMfa implements MfaStrategy { //Genera un codigo de mayusculas
    public LetrasMfa() {
    }

    public String generateCode() {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < 8; ++i) {
            char a = (char)((int)(Math.random() * 26.0 + 65.0));
            str.append(a);
        }

        return str.toString();
    }
}