package mx.ipn.ivan.erickf.bd_erickf_ivan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String nombre;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");

        muestraDatos.setText("Nombre: "+nombre);

    }

    public void GuardarBD2(View v) {
        Intent envia = new Intent(this, Main2Activity.class);
        Bundle datos = new Bundle();
        //datos.putString("nombre", nombre.getText().toString().trim());
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }
}
