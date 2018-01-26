package com.company;

public class Main {

    public static void main(String[] args) {
          Frescos fres = new Fresco ("4/Marzo", "7/Marzo","$2.50",22345);
          System.out.println("Tomate");
          System.out.println("Fecha de entrega: " +fres.getfechaEntrada());
          System.out.println("Fecha de caducidad"+ fres.getCaducidad());
          System.out.println("Precio: " + fres.getprecio());
          System.out.println("Numero de lote : " + fres.numLote() );

          Refri ref = new Refri ("10ºC","20/Agosto","$20.00", 42167 );
          System.out.println("Leche");
          System.out.println("Temperatura recomendad: " +ref.getfechaEntrada());
          System.out.println("Fecha de caducidad"+ ref.getCaducidad());
          System.out.println("Precio: " + ref.getprecio());
          System.out.println("Numero de lote : " + ref.numLote() );

          congAire congair = new congAire( "0ºC", "31/Diciembre", "$45.00", 11432 );
          System.out.println("Verduras congeladas");
          System.out.println("Temperatura recomendad de congelacion"+ congair.gettempCong());
          System.out.println("Fecha de entrega: " +congair.getfechaEntrada());
          System.out.println("Fecha de caducidad"+ congair.getCaducidad());
          System.out.println("Precio: " + congair.getprecio());
          System.out.println("Numero de lote : " + congair.numLote() );

          congAgua congag = new CongAgua("0ºC", "15/Octubre", "$19.00", 47581 );
          System.out.println( "Filete Ribeye");
          System.out.println("Temperatura recomendad de congelacion"+ congag.gettempCong());
          System.out.println("Fecha de entrega: " +congag.getfechaEntrada());
          System.out.println("Fecha de caducidad"+ congag.getCaducidad());
          System.out.println("Precio: " + congag.getprecio());
          System.out.println("Numero de lote : " + congag.numLote() );

          congNitro congnit = new congNitro("0ºC","25/Noviembre", "$65.00",23649);
          System.out.println("Papas fritas");
          System.out.println("Temperatura recomendad de congelacion"+ congag.gettempCong());
          System.out.println("Fecha de entrega: " +congnit.getfechaEntrada());
          System.out.println("Fecha de caducidad"+ congnit.getCaducidad());
          System.out.println("Precio: " + congnit.getprecio());
          System.out.println("Numero de lote : " + congnit.numLote() );






    }
}
