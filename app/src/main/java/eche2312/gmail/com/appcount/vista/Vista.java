package eche2312.gmail.com.appcount.vista;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import eche2312.gmail.com.appcount.R;
import eche2312.gmail.com.appcount.presentador.Presentador;

public class Vista extends Activity implements IVista{

    //Declaramos los atributos.
    private TextView pantalla;
    private Button botonMas;
    private Button botonMenos;

    private Presentador presentador;



    //Creamos la clase para escuchar al boton.

    /*class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            //Hacemos un log para mostrar en consola que la aplicacion esta arrancando.
            Log.d("Vista", "boton pulsado");

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
        Log.d("Vista", "Arrancando mi App");

        //Indicamos que nos muestre el valor 0 en la pantalla.
        pantalla = findViewById(R.id.textView);

        presentador = new Presentador();

        pantalla.setText("" + presentador.getContador());
        botonMas = findViewById(R.id.button2);
        botonMenos = findViewById(R.id.button3);

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hacemos un log para mostrar en consola que la aplicacion esta arrancando.
                Log.d("Vista", "boton + pulsado");

                //Indicamos que aumente el valor de la pantalla al pusar el boton +.
                presentador.incrementar();
                pantalla.setText("" + presentador.getContador());
            }
        });

        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Vista", "boton + pulsado");
                presentador.decrementar();
                pantalla.setText("" + presentador.getContador());
            }
        });
    }

}
