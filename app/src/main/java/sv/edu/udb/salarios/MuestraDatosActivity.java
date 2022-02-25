package sv.edu.udb.salarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MuestraDatosActivity extends AppCompatActivity {

    private TextView lblNombre;
    private TextView lblHoras;
    private TextView lblISSS;
    private TextView lblAFP;
    private TextView lblRenta;
    private TextView lblSalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_datos);

        lblNombre = (TextView) findViewById(R.id.lblNombre);
        lblHoras = (TextView) findViewById(R.id.lblHoras);
        lblISSS = (TextView) findViewById(R.id.lblISSS);
        lblAFP = (TextView) findViewById(R.id.lblAFP);
        lblRenta = (TextView) findViewById(R.id.lblRenta);
        lblSalario = (TextView) findViewById(R.id.lblSalario);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("txtNombre");
        String horas = bundle.getString("txtHoras");
        int valorHoras = Integer.parseInt(horas);

        // Calculos
        double salario =  valorHoras * 8.50;
        double isss = salario * 0.02;
        double afp = salario * 0.03;
        double renta = salario * 0.04;
        double totalSalario = salario - (isss + afp + renta);

        // Muestra de datos
        lblNombre.setText(nombre);
        lblHoras.setText(horas);
        lblISSS.setText("$" + isss);
        lblAFP.setText("$" + afp);
        lblRenta.setText("$" + renta);
        lblSalario.setText("$" + totalSalario);
    }

    public void finalizar(View view){
        finish();
    }
}