class Refri extends Producto{
    protected String tempRefri;

    public Refri (String numLote, String Caducidad, int precio){
        super(numLote,Caducidad,precio);
        this.tempRefri=tempRefri;
    }
    public String gettempRefri (){
        return this.tempRefri;
    }
}
