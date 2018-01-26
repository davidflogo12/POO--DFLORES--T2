package com.company;

public class Main {

    public static void main(String[] args) {
          Frescos fres = new Fresco ("4/Marzo", "7/Marzo","$2.50",22345);
          System.out.println("Tomate"
                             +"Fecha de entrega: " + fres.getfechaEntrada()
                             +"Fecha de caducidad"+ fres.getCaducidad()
                             +"Precio: " + fres.getprecio()
                             +"Numero de lote : " + fres.numLote()  );
        
          Refri ref = new Refri ("10ºC","20/Agosto","$20.00", 42167 );
          System.out.println("Leche"
                             +"Temperatura recomendad: " +ref.getfechaEntrada()
                             +"Fecha de caducidad"+ ref.getCaducidad()
                             +"Precio: " + ref.getprecio()
                             +"Numero de lote : " + ref.numLote());
         
          congAire congair = new congAire( "0ºC", "31/Diciembre", "$45.00", 11432 );
          System.out.println("Verduras congeladas"
                             +"Temperatura recomendad de congelacion"+ congair.gettempCong()
                             +"Fecha de entrega: " +congair.getfechaEntrada()+
                             +"Fecha de caducidad"+ congair.getCaducidad()
                             +"Precio: " + congair.getprecio()
                             +"Numero de lote : " + congair.numLote() );
        
          congAgua congag = new CongAgua("0ºC", "15/Octubre", "$19.00", 47581 );
          System.out.println( "Filete Ribeye"
                             +"Temperatura recomendad de congelacion"
                             + congag.gettempCong()
                             +"Fecha de entrega: " +congag.getfechaEntrada()
                             +"Fecha de caducidad"+ congag.getCaducidad()
                             +"Precio: " + congag.getprecio()
                             +"Numero de lote : " + congag.numLote());
         
          congNitro congnit = new congNitro("0ºC","25/Noviembre", "$65.00",23649);
          System.out.println("Papas fritas"
                             +"Temperatura recomendad de congelacion"+ congag.gettempCong()
                             +"Fecha de entrega: " +congnit.getfechaEntrada()
                             +"Fecha de caducidad"+ congnit.getCaducidad()
                             +"Precio: " + congnit.getprecio()
                             +"Numero de lote : " + congnit.numLote));
          


    }
}
