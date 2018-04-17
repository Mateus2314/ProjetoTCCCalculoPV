package com.projetocpv.example.mateus2314.projetotcc_calculopv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        seguir4act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Rend_invPV = Rend_inv.getText().toString();
                String Tensao_SaidaPV = Tensao_Saida.getText().toString();
                String Corrente_SaidaPV = Corrente_Saida.getText().toString();
                String Peso_InvPV = Peso_inv.getText().toString();
                String Area_invPV = Area_inv.getText().toString();
                String Garantia_invPV = Garantia_inv.getText().toString();
                String Preco_invPV = Preco_inv.getText().toString();
                if (Rend_invPV.isEmpty()|| Tensao_SaidaPV.isEmpty()|| Corrente_SaidaPV.isEmpty()||
                        Peso_InvPV.isEmpty()||Area_invPV.isEmpty()|| Garantia_invPV.isEmpty()||
                        Preco_invPV.isEmpty()){
                    Toast.makeText(Main3Activityinversor.this, "Preencha os dados pedidos",Toast.LENGTH_SHORT).show();

                }else{
                    Float Rend_invfloat = Float.parseFloat(Rend_invPV);
                    Float Tensao_saidafloat = Float.parseFloat(Tensao_SaidaPV);
                    Float Corrente_saidafloat = Float.parseFloat(Corrente_SaidaPV);
                    Float Peso_invfloat = Float.parseFloat(Peso_InvPV);
                    Float Garantia_inv_float = Float.parseFloat(Garantia_invPV);
                    Float Preco_invfloat = Float.parseFloat(Preco_invPV);
                    startActivity(new Intent(Main3Activityinversor.this,Main4ActivityModulo.class));
                }

            }
        });




    }
}
