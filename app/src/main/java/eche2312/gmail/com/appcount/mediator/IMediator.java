package eche2312.gmail.com.appcount.mediator;

import eche2312.gmail.com.appcount.IMain;

/**
 * Created by eched on 15/02/2018.
 */

public interface IMediator {

    interface Lifecycle{
        void startingScreen(IMain.ToAppCount presenter);
        void resumingScreen(IMain.AppCountTo presenter);

    }

    interface Navigation{
        void goToNextScreen(IMain.AppCountTo presenter);
        void backToPreviousScreen(IMain.AppCountTo presenter);
    }

}
