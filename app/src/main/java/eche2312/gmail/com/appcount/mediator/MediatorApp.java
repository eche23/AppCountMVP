package eche2312.gmail.com.appcount.mediator;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import eche2312.gmail.com.appcount.IMain;
import eche2312.gmail.com.appcount.model.MainModel;
import eche2312.gmail.com.appcount.presenter.MainPresenter;
import eche2312.gmail.com.appcount.view.MainView;

/**
 * Created by eched on 15/02/2018.
 */

public class MediatorApp extends Application implements IMediator.Lifecycle, IMediator.Navigation {

    protected final String TAG = this.getClass().getSimpleName();
    private MainPresenter mainPresenter;
    private MainModel mainModel;

    private AppCountState toAppCountState;
    private AppCountState appCountToState;

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d(TAG, "calling onCreate()");
        toAppCountState = new AppCountState();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "calling onTerminate()");
    }


    public MainPresenter getPresenter(MainView mainView) {
        if(mainPresenter == null){
            mainModel = new MainModel();
            mainPresenter = new MainPresenter(this, mainModel, mainView);
        }

        return mainPresenter;

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Lifecycle

    @Override
    public void startingScreen(IMain.ToAppCount presentador){
        if(toAppCountState != null){
            Log.d(TAG, "calling settingInitialState()");

            Log.d(TAG, "calling removingInitialState");
            toAppCountState = null;

        }

        if(appCountToState != null){
            Log.d(TAG, "calling settingUpdatedState()");

            Log.d(TAG, "calling removingUpdateState()");
            appCountToState = null;
        }

        presentador.onScreenStarted();
    }

    @Override
    public void resumingScreen(IMain.AppCountTo presenter) {
        if(appCountToState != null){
            Log.d(TAG, "calling resumingScreen()");
            Log.d(TAG, "calling restoringUpdatedState()");

            Log.d(TAG, "calling removingUpdateState()");
            appCountToState = null;
        }

        presenter.onScreenResumed();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Navigation

    @Override
    public void goToNextScreen(IMain.AppCountTo presenter) {
        Log.d(TAG,"calling savingUpdatedState()");
        appCountToState = new AppCountState();

        Context view = presenter.getManagedContext();
        if(view != null){
            Log.d(TAG, "calling strartingNextScreen()");
            view.startActivity(new Intent(view, MainView.class));
        }

    }

    @Override
    public void backToPreviousScreen(IMain.AppCountTo presenter) {
        Log.d(TAG, "calling savingUpdateState()");
        appCountToState = new AppCountState();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //State

    private class AppCountState{

    }


}
