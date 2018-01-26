public class Congelados extends Producto {
    protected String tempCong;

    public Congelados (String numLote, String Caducidad, int precio) {
         super(numLote, Caducidad, precio);
         this.tempCong = tempCong;
     }
     public String getTempCong(){
             return this.tempCong;
     }
}

