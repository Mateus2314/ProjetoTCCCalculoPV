package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.R;

public class Main4ActivityModulo extends AppCompatActivity {

    private EditText ModelomoduloSolar;
    private EditText PotenciaNominalModuloSolar;
    private EditText AreaModuloSolar;
    private EditText RendimentoModuloSolar;
    private EditText TensaoOCModuloSolar;
    private EditText TensaoMediaDCModuloSOlar;
    private EditText CorrenteMediaDCModulo;
    private EditText PesoModuloSolar;
    private EditText PrecoModulosSolar;
    private Button ButtonCadastrarModulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_modulo);

        ModelomoduloSolar = (EditText)findViewById(R.id.editModeloModuloSolar);
        PotenciaNominalModuloSolar = (EditText)findViewById(R.id.edittxPotenciaNominalmodulo);
        AreaModuloSolar = (EditText)findViewById(R.id.EditAreadoModuloSolar);
        RendimentoModuloSolar = (EditText)findViewById(R.id.editRendimentoModuloSolar);
        TensaoOCModuloSolar = (EditText)findViewById(R.id.editTensaoOc);
        TensaoMediaDCModuloSOlar = (EditText)findViewById(R.id.editTensaoMediaDC);
        CorrenteMediaDCModulo = (EditText)findViewById(R.id.editCorrentmed);
        PesoModuloSolar = (EditText)findViewById(R.id.editPeso_Modulo_Solar);
        PrecoModulosSolar = (EditText)findViewById(R.id.editPrecoPlacaSolar);

        ButtonCadastrarModulo = (Button)findViewById(R.id.btcadastrarModulo);


        ButtonCadastrarModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4ActivityModulo.this,MainActivity.class));
            }
        });



    }
}
