package eche2312.gmail.com.appcount.modelo;

import eche2312.gmail.com.appcount.presentador.Presentador;


/**
 * Created by eched on 04/02/2018.
 */

public class Modelo implements IModelo {


   private int contador;


   public Modelo(){
       contador = 0;
   }


    @Override
    public void incrementar() {
        contador++;

    }

    @Override
    public void decrementar() {
        contador--;
    }

    @Override
    public int getContador(){
       return contador;
    }
}
