package eche2312.gmail.com.appcount.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import eche2312.gmail.com.appcount.IMain;
import eche2312.gmail.com.appcount.R;
import eche2312.gmail.com.appcount.mediator.MediatorApp;
import eche2312.gmail.com.appcount.presenter.MainPresenter;

public class MainView extends Activity implements IMain.PresenterToView {

    //Declaramos los atributos.
    private TextView pantalla;
    private Button botonMas;
    private Button botonMenos;


    protected final String TAG = this.getClass().getSimpleName();



    //Creamos la clase para escuchar al boton.

    /*class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            //Hacemos un log para mostrar en consola que la aplicacion esta arrancando.
            Log.d("MainView", "boton pulsado");

            //Indicamos que aumente el valor de la pantalla al pusar el boton +.
            contador++;
            pantalla.setText("" + contador);
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hacemos un log para mostrar en consola que la aplicacion esta arrancando.
        Log.d(TAG, "calling onCreate()");

        //Indicamos que nos muestre el valor 0 en la pantalla.
        pantalla = findViewById(R.id.textView);

        final MediatorApp mediator = (MediatorApp) getApplication();
        final MainPresenter mainPresenter = mediator.getPresenter(this);

        //mainPresenter = new MainPresenter();
        pantalla.setText(mainPresenter.getTextToDisplay());


        botonMas = findViewById(R.id.button2);
        botonMenos = findViewById(R.id.button3);

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hacemos un log para mostrar en consola que la aplicacion esta arrancando.
                Log.d(TAG, "boton + pulsado");

                //Indicamos que aumente el valor de la pantalla al pusar el boton +.
                mainPresenter.buttonPlusPressed();
                pantalla.setText(mainPresenter.getTextToDisplay());
            }
        });

        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "boton - pulsado");
                mainPresenter.buttonLessPressed();
                pantalla.setText(mainPresenter.getTextToDisplay());
            }
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "calling onResume()");
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Log.d(TAG, "calling onBackPressed()");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "calling onDestroy()");
    }


    @Override
    public void finishScreen() {
        Log.d(TAG, "calling finishScreen()");
        finish();

    }
}
