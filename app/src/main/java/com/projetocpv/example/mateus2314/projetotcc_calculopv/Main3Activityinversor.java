package com.projetocpv.example.mateus2314.projetotcc_calculopv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activityinversor extends AppCompatActivity {

    private EditText Rend_inv;
    private EditText Tensao_Saida;
    private EditText Corrente_Saida;
    private EditText Peso_inv;
    private EditText Area_inv;
    private EditText Garantia_inv;
    private EditText Preco_inv;
    private Button seguir4act;
    private Button volta2act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_activityinversor);

        Rend_inv = (EditText)findViewById(R.id.edit_rend_inv);
        Tensao_Saida = (EditText)findViewById(R.id.editTensao_Saida);
        Corrente_Saida = (EditText)findViewById(R.id.editCorrente_Saida);
        Peso_inv = (EditText)findViewById(R.id.editPeso_Inv);
        Area_inv = (EditText)findViewById(R.id.editArea_Inv);
        Garantia_inv = (EditText)findViewById(R.id.edit_Garantia_Inv);
        Preco_inv = (EditText)findViewById(R.id.edit_Preco_Inv);
        seguir4act = (Button)findViewById(R.id.idbuttonSeguirAct4);
        volta2act = (Button)findViewById(R.id.idbuttonVoltaract2);

        volta2act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activityinversor.this,Main2Activity_dados_inversor.class));
            }
        });




    }
}
