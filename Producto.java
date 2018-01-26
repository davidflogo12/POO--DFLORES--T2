
public class Producto{
    protected String numLote;
    protected String Caducidad;
    protected int precio;

    public Producto (){
        this.numLote="";
        this.Caducidad="";
        this.precio=0;
    }

    public Producto(String numLote, String Caducidad, int precio){
        this.numLote=numLote;
        this.Caducidad=Caducidad;
        this.precio=precio;
    }

    public Producto (String numLote, String Caducidad){
        this.numLote=numLote;
        this.Caducidad=Caducidad;
    }
    public String getnumLote(){
        return this.numLote;
    }
    public String getCaducidad(){
        return this.Caducidad;
    }
    public int getPrecio(){
        return this.precio;
    }
}

