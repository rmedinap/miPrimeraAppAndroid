package pe.gob.saludpol.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        btnSaludar = (Button) findViewById(R.id.btnSaludar);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MostrarSaludo();
            }
        });

    }

    private void MostrarSaludo() {
        String vNombre = txtNombre.getText().toString();
        String vSaludo = "Bienvenido " + vNombre;
        Toast.makeText(this, vSaludo, Toast.LENGTH_LONG).show();
        //Toast.makeText(this, "Y DALE U!", Toast.LENGTH_SHORT).show();

    }
}
