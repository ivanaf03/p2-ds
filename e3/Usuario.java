package e3;

public class Usuario {
    private String id;
    private final String password;
    private MfaStrategy mfaStrategy;

    public Usuario(String id, String password, MfaStrategy mfaStrategy){
        this.id=id;
        this.password=password;
        this.mfaStrategy=mfaStrategy;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setMfaStrategy(MfaStrategy mfaStrategy){
        this.mfaStrategy=mfaStrategy;
    }
    public String getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }
    public MfaStrategy getMfaStrategy(){
        return mfaStrategy;
    }
}
