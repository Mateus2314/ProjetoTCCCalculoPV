package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.R;

public class CalculeAgoraInicioActivity extends AppCompatActivity {

    private Spinner sp1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcule_agora_inicio);

        Bundle extra = getIntent().getExtras();
         if(extra != null){
             String contaEnergiaCal = extra.getString("contaEnergia");
             Float contaEnergiapv = Float.parseFloat(contaEnergiaCal);

             sp1 = (Spinner)findViewById(R.id.spinnerModuloSolar);

             ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.modulosSolares,android.R.layout.simple_spinner_item);

             sp1.setAdapter(adapter);

             AdapterView.OnItemSelectedListener escolha = new AdapterView.OnItemSelectedListener(){

                 @Override
                 public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                     String item = sp1.getSelectedItem().toString();
                     Toast.makeText(getApplicationContext(),"Item escolhido: "+item,Toast.LENGTH_LONG).show();
                 }

                 @Override
                 public void onNothingSelected(AdapterView<?> parent) {

                 }
             };

             sp1.setOnItemSelectedListener(escolha);



         }
    }
}
