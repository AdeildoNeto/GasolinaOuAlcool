package aneto.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtGasolina;
    private EditText txtAlcool;
    private Button btnVerifica;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGasolina = findViewById(R.id.precoGasolinaId);
        txtAlcool = findViewById(R.id.precoAlcoolId);
        btnVerifica = findViewById(R.id.btnVerificar);
        resultado = findViewById(R.id.textView);

        btnVerifica.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double gasolina = Double.parseDouble(txtGasolina.getText().toString());
                double alcool = Double.parseDouble(txtAlcool.getText().toString());

                double result = alcool/gasolina;

                if(result > 0.7){
                    resultado.setText("Abasteça com Gasolina");
                }else {
                    resultado.setText("Abasteça com Alcool");
                }
            }
        });


    }
}
