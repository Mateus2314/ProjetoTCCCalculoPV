package com.projetocpv.example.mateus2314.projetotcc_calculopv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CalculeAgoraInicioActivity extends AppCompatActivity {

    private Spinner sp1;

    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcule_agora_inicio);

        Bundle extra = getIntent().getExtras();
         if(extra != null){
             String contaEnergiaCal = extra.getString("contaEnergia");
             Float contaEnergiapv = Float.parseFloat(contaEnergiaCal);

             sp1 = (Spinner)findViewById(R.id.spinnerModuloSolar);

             adapter = ArrayAdapter.createFromResource(this,R.array.modulosSolares,android.R.layout.simple_spinner_item);
             adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
             sp1.setAdapter(adapter);




         }
    }
}
