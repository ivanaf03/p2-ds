package e3;

public class AlfanumericMfa implements MfaStrategy { //Genera una combinación aleatoria de caracteres del teclado
    public AlfanumericMfa() {
    }
    public String generateCode() {
        StringBuilder str=new StringBuilder();

        for(int i = 0; i < 6; i++) {
            char a = (char)((int)(Math.random() * 94.0 + 33.0));
            str.append(a);
        }

        return str.toString();
    }

}
