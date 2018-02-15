package eche2312.gmail.com.appcount.presentador;

/**
 * Created by eched on 04/02/2018.
 */

 public interface IPresentador {

    public void incrementar();

    public void decrementar();

    public int getContador();

    interface ToAppCount{
        void onScreenStarted();
    }

}

