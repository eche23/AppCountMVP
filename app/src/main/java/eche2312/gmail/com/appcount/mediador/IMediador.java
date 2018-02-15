package eche2312.gmail.com.appcount.mediador;

import eche2312.gmail.com.appcount.presentador.IPresentador;

/**
 * Created by eched on 15/02/2018.
 */

public interface IMediador {

    interface Lifecycle{
        void startingScreen(IPresentador.ToAppCount presentador);

    }

}
