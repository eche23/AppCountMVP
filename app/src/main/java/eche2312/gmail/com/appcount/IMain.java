package eche2312.gmail.com.appcount;

import android.content.Context;

/**
 * Created by eched on 16/02/2018.
 */

public interface IMain {

    interface PresenterToModel{
        void incrementar();
        void decrementar();
        int getContador();
        boolean isNumOfTimesCompleted();
        void resetMsgByBtnClicked();

    }

    interface ModelToPresenter{

    }


    interface ViewToPresenter{
        void buttonPlusPressed();
        void buttonLessPressed();
        String getTextToDisplay();
        Context getManagedContext();


    }

    interface PresenterToView{
        void finishScreen();
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //State

    interface State{

    }

    interface ToAppCount extends State{
        void onScreenStarted();
    }

    interface AppCountTo extends State{
        Context getManagedContext();
        void destroyView();
        void onScreenResumed();
    }

}
