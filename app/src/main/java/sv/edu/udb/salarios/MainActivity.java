package sv.edu.udb.salarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.txtNombre);
        horas = (EditText) findViewById(R.id.txtHoras);

    }

    public void act_muestra_datos (View view){
        Intent i = new Intent(this, MuestraDatosActivity.class);
        i.putExtra("txtNombre", nombre.getText().toString());
        i.putExtra("txtHoras", horas.getText().toString());
        startActivity(i);
    }
}