package eche2312.gmail.com.appcount.presentador;

import eche2312.gmail.com.appcount.modelo.Modelo;
import eche2312.gmail.com.appcount.vista.Vista;

/**
 * Created by eched on 04/02/2018.
 */

public class Presentador implements IPresentador {

    private Modelo modelo;


    public Presentador(){
        modelo = new Modelo();

    }

    @Override
    public void sumar() {
        modelo.sumar();

    }

    @Override
    public void restar() {
        modelo.restar();

    }

    public int getContador(){
        return modelo.getContador();
    }
}
