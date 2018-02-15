package eche2312.gmail.com.appcount.presentador;

import android.app.Application;
import android.util.Log;

import eche2312.gmail.com.appcount.mediador.IMediador;
import eche2312.gmail.com.appcount.modelo.Modelo;

/**
 * Created by eched on 04/02/2018.
 */

public class Presentador extends Application implements IPresentador {

    protected final String TAG = this.getClass().getSimpleName();
    private Modelo modelo;

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d(TAG, "calling onCreate()");

        Log.d(TAG, "calling startingScreen()");
        IMediador.Lifecycle mediador = (IMediador.Lifecycle) getApplication();
        mediador.startingScreen(this);

    }


    public Presentador(){
        modelo = new Modelo();

    }

    @Override
    public void incrementar() {
        modelo.incrementar();

    }

    @Override
    public void decrementar() {
        modelo.decrementar();

    }

    @Override
    public int getContador(){
        return modelo.getContador();
    }
}
