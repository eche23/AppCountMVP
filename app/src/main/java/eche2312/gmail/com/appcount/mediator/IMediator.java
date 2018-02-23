package eche2312.gmail.com.appcount.mediator;

import eche2312.gmail.com.appcount.IMain;
import eche2312.gmail.com.appcount.presenter.MainPresenter;
import eche2312.gmail.com.appcount.view.MainView;

/**
 * Created by eched on 15/02/2018.
 */

public interface IMediator {

    MainPresenter getPresenter(MainView view);

    interface Lifecycle{
        void startingScreen(IMain.ToAppCount presenter);
        void resumingScreen(IMain.AppCountTo presenter);

    }

    interface Navigation{
        void goToNextScreen(IMain.AppCountTo presenter);
        void backToPreviousScreen(IMain.AppCountTo presenter);
    }

}
