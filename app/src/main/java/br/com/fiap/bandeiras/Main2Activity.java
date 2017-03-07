package br.com.fiap.bandeiras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    ImageView imgBandeiras;
    Spinner spinner;

    int[] bandeiras = {R.drawable.argentina, R.drawable.brasil, R.drawable.franca, R.drawable.japao};
    String[] paises = {"Argentina", "Brasil", "França", "Japão"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgBandeiras = (ImageView)findViewById(R.id.imgBandeiras);
        spinner = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, paises);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                imgBandeiras.setImageResource(bandeiras[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
