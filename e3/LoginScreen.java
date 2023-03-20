package e3;

import java.util.HashMap;

public class LoginScreen {
    private LoginStrategy loginStrategy;
    private Usuario usuario;
    private final HashMap<String,String> mapa;

    public LoginScreen(HashMap<String,String> mapa){
        this.mapa=mapa;
        loginStrategy=new MailLogin(this);
    }

    public void setLoginStrategy(LoginStrategy loginStrategy){
        this.loginStrategy=loginStrategy;
    }
    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
    }
    public String authenticate(){
        if(loginStrategy.validateId(usuario.getId())){
            if(loginStrategy.authenticatePassword(usuario.getId(), usuario.getPassword())){
                return usuario.getMfaStrategy().generateCode();
            } else{
                return null;
            }
        } else{
            return null;
        }
    }
    public String getMapId(String id){
        return mapa.get(id);
    }
    public static void main(String[] args){
        HashMap<String,String> mapa=new HashMap<>();
        mapa.put("eduMosqueira@gmail.com", "ILoveJava1234");
        LoginScreen loginScreen=new LoginScreen(mapa);
        MfaStrategy numeros=new NumerosMfa();
        MfaStrategy letras= new LetrasMfa();
        MfaStrategy alphanum=new AlfanumericMfa();
        Usuario user=new Usuario("eduMosqueira@gmail.com", "ILoveJava1234", numeros);
        loginScreen.setUsuario(user);
        System.out.println(loginScreen.authenticate());
        user.setMfaStrategy(letras);
        System.out.println(loginScreen.authenticate());
        user.setMfaStrategy(alphanum);
        System.out.println(loginScreen.authenticate());
    }
}