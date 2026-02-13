
public class Cliente {
    private String rs;
    private String rfc;
    private String gmail;
    
    public Cliente(String rs, String rfc, String gamil){
        this.rs = rs;
        this.rfc = rfc;
        this.gmail = gmail;
    }
    @Override
    public String toString(){
        return"rs: "+this.rs+"\n"+
                "rfc: "+this.rfc+"\n"+
                "gmail: "+this.gmail;
    }
}
