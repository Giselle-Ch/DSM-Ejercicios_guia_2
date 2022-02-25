package sv.edu.udb.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView valorMostrar;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        valorMostrar = (TextView) findViewById(R.id.lblContador);
    }

    public void agregar(View view){
        contador++;
        if(contador == 10){
            contador = 0;
        }
        valorMostrar.setText(Integer.toString(contador));


    }
}