package eche2312.gmail.com.appcount.model;


import eche2312.gmail.com.appcount.IMain;

/**
 * Created by eched on 04/02/2018.
 */

public class MainModel implements IMain.PresenterToModel {


   private int contador;
   private int maxNumOfTimes;


   public MainModel(){
       contador = 0;
       maxNumOfTimes = 5;
   }


    @Override
    public void incrementar() {
        contador++;
    }

    @Override
    public void decrementar() {
        contador--;
    }

    @Override
    public int getContador(){
       return contador;
    }

    @Override
    public boolean isNumOfTimesCompleted() {
        if(contador == maxNumOfTimes){
            return true;
        }
        return false;
    }

    @Override
    public void resetMsgByBtnClicked() {
        contador = 0;
    }
}
