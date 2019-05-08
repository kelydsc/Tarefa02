package br.com.digitalhouse.digital.tarefa02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCuriosidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCuriosidade = findViewById(R.id.TextViewCuriosidade);

        textViewCuriosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "O azul é uma das três cores-luz " +
                     "primárias, e uma cor-pigmento secundária, resultado da sobreposição dos " +
                     "pigmentos ciano e magenta. Seu comprimento de onda é da ordem de 455 a 492 " +
                     "nanômetros do espectro de cores visíveis. O azul costuma estar associado à " +
                     "frieza, depressão, monotonia.", Toast.LENGTH_SHORT).show();

            }
        });






    }
}
