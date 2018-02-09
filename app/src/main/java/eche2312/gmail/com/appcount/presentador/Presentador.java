package eche2312.gmail.com.appcount.presentador;

import eche2312.gmail.com.appcount.modelo.Modelo;
import eche2312.gmail.com.appcount.vista.Vista;

/**
 * Created by eched on 04/02/2018.
 */

public class Presentador implements IPresentador {

    private Modelo modelo;
    private Vista vista;

    @Override
    public int sumar() {
        int resultado = modelo.sumar();
        return resultado;
    }

    @Override
    public int restar() {
        int resultado = modelo.restar();
        return resultado;
    }
}
