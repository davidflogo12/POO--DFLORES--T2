
public class Frescos extends Producto {
    protected String fechaEntrada;

    public Frescos( String fechaEntrada, String numLote, String Caducidad, int precio) {
        super(numLote, Caducidad, precio);
        this.fechaEntrada=fechaEntrada;
    }

    public String getfechaEntrada(){
        return this.fechaEntrada;
    }
}

