package eche2312.gmail.com.appcount.mediador;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import eche2312.gmail.com.appcount.mediador.IMediador.Lifecycle;
import eche2312.gmail.com.appcount.presentador.IPresentador;

/**
 * Created by eched on 15/02/2018.
 */

public class MediadorApp extends Application implements IMediador.Lifecycle {

    protected final String TAG = this.getClass().getSimpleName();

    private AppCountState toAppCountState;

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d(TAG, "calling onCreate()");

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Lifecycle

    @Override
    public void startingScreen(IPresentador.ToAppCount presentador){
        if(toAppCountState != null){
            Log.d(TAG, "calling settingInitialState()");

            Log.d(TAG, "calling removingInitialState");
            toAppCountState = null;

        }

        presentador.onScreenStarted();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //State

    private class AppCountState{

    }
}
