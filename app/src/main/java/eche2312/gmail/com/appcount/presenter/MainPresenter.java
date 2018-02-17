package eche2312.gmail.com.appcount.presenter;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import eche2312.gmail.com.appcount.IMain;
import eche2312.gmail.com.appcount.mediator.IMediator;
import eche2312.gmail.com.appcount.mediator.IMediator.Navigation;
import eche2312.gmail.com.appcount.mediator.MediatorApp;
import eche2312.gmail.com.appcount.model.MainModel;
import eche2312.gmail.com.appcount.view.MainView;

/**
 * Created by eched on 04/02/2018.
 */

public class MainPresenter extends MainView implements IMain.ViewToPresenter, IMain.ModelToPresenter, IMain.AppCountTo, IMain.ToAppCount {

    protected final String TAG = this.getClass().getSimpleName();
    private MainModel mainModel;
    private MainView mainView;
    private MediatorApp mediator;
    private boolean buttonClicked;


    public MainPresenter(MediatorApp mediator, MainModel mainModel, MainView mainView){
        this.mediator = mediator;
        this.mainModel = mainModel;
        this.mainView = mainView;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IMediator.Lifecycle mediator = (IMediator.Lifecycle) getApplication();
        mediator.startingScreen(this);

    }

    @Override
    public void onResume(){
        super.onResume();
        IMediator.Lifecycle mediator = (IMediator.Lifecycle) getApplication();
        mediator.resumingScreen(this);
    }

    @Override
    public void onBackPressed(){
        IMediator.Navigation mediator = (IMediator.Navigation) getApplication();
        mediator.backToPreviousScreen(this);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }


    @Override
    public void buttonPlusPressed() {
        Log.d(TAG, "calling buttonPlusPressed()");
        if(mainModel.isNumOfTimesCompleted()){
            mainModel.resetMsgByBtnClicked();

            Log.d(TAG, "calling goToNextScreen()");
            IMediator.Navigation mediator = (IMediator.Navigation) getApplication();
            mediator.goToNextScreen(this);
            return;

        }

        mainModel.incrementar();
        buttonClicked = true;

    }

    @Override
    public void buttonLessPressed() {
        mainModel.decrementar();

    }

    @Override
    public String getTextToDisplay(){
        return "" + mainModel.getContador();
    }


    @Override
    public void onScreenStarted() {
        Log.d(TAG, "calling onScreenStarted()");
        setCurrentState();

    }

    @Override
    public void onScreenResumed() {
        Log.d(TAG, "calling onScreenResumed");

    }

    @Override
    public Context getManagedContext() {
        return getApplicationContext();
    }

    @Override
    public void destroyView() {
        mainView.finishScreen();
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private void setCurrentState(){
        Log.d(TAG, "calling setCurrentState()");

    }
}
