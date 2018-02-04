package eche2312.gmail.com.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    //Declaramos los atributos.
    private TextView pantalla;
    private Button botonMas;
    private int contador;

    //Creamos la clase para escuchar al boton.

    /*class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            //Hacemos un log para mostrar en consola que la aplicacion esta arrancando.
            Log.d("MainActivity", "boton pulsado");

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
        Log.d("MainActivity", "Arrancando mi App");

        //Indicamos que nos muestre el valor 0 en la pantalla.
        pantalla = findViewById(R.id.textView);
        contador = 0;
        pantalla.setText("" + contador);

        botonMas = findViewById(R.id.button2);
        //botonMas.setOnClickListener(new ButtonListener());

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hacemos un log para mostrar en consola que la aplicacion esta arrancando.
                Log.d("MainActivity", "boton pulsado");

                //Indicamos que aumente el valor de la pantalla al pusar el boton +.
                contador++;
                pantalla.setText("" + contador);
            }
        });


    }
}
