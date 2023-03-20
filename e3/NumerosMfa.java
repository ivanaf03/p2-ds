package e3;

public class NumerosMfa implements MfaStrategy { //Genera un codigo de 4 numeros
    public NumerosMfa() {
    }

    public String generateCode() {
        int x = (int)(Math.random() * 9000.0 + 1000.0);
        return String.valueOf(x);
    }
}
