package eche2312.gmail.com.appcount.modelo;

import eche2312.gmail.com.appcount.presentador.Presentador;

/**
 * Created by eched on 04/02/2018.
 */

public class Modelo implements IModelo {

   private Presentador presentador;
   private int contador;

   public Modelo(){
       contador = 0;
   }


    @Override
    public int sumar() {
        int resultado = contador++;
        return resultado;
    }

    @Override
    public int restar() {
        int resultado = contador--;
        return resultado;
    }
}
