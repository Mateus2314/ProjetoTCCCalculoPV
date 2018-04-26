package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.R;


public class Main2Activity_dados_inversor extends AppCompatActivity {

    private EditText modeloInversor;
    private EditText potnomInv;
    private EditText numMPPTTrackers;
    private EditText MPPTmenorV;
    private EditText MPPTmaiorV;
    private EditText Coef_MPPT;
    private EditText Imaxstring;
    private Button seguir3act;
    private Button volta1act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_dados_inversor);

        //Bundle extra = getIntent().getExtras();
       // if(extra != null){
       //     String padraoEntrada2 = extra.getString("tipo_entrada");
       // }

        modeloInversor = (EditText) findViewById(R.id.idModInver);
        potnomInv = (EditText) findViewById(R.id.id_pot_nominal);
        numMPPTTrackers = (EditText) findViewById(R.id.idnumTracMPPT);
        MPPTmenorV = (EditText) findViewById(R.id.idmenor_mppt);
        MPPTmaiorV = (EditText) findViewById(R.id.idmaiorVMPPT);
        Coef_MPPT = (EditText) findViewById(R.id.id_coefi_MPPT);
        Imaxstring = (EditText) findViewById(R.id.IdcorrenteMaxStr);
        seguir3act = (Button) findViewById(R.id.bt_inversor2);
        volta1act = (Button) findViewById(R.id.idvoltar_main_inv);

        volta1act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity_dados_inversor.this,MainActivity.class));
            }
        });

        seguir3act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String modeloInversoPV = modeloInversor.getText().toString();
                String potnomInvPV = potnomInv.getText().toString();
                String numMPPTTrackersPV = numMPPTTrackers.getText().toString();
                String MPPTmenorVPV = MPPTmenorV.getText().toString();
                String MPPTmaiorVPV = MPPTmaiorV.getText().toString();
                String Coef_MPPTPV = Coef_MPPT.getText().toString();
                String ImaxstringPV = Imaxstring.getText().toString();
                if (modeloInversoPV.isEmpty() || potnomInvPV.isEmpty() || numMPPTTrackersPV.isEmpty()||
                        MPPTmenorVPV.isEmpty() || MPPTmaiorVPV.isEmpty() || Coef_MPPTPV.isEmpty()||
                        ImaxstringPV.isEmpty()){
                    Toast.makeText(Main2Activity_dados_inversor.this,"Preencha os dados pedidos",Toast.LENGTH_LONG).show();
                }else {
                    Float potnomInv_float = Float.parseFloat(potnomInvPV);
                    Float numMPPTTrackers_float = Float.parseFloat(numMPPTTrackersPV);
                    Float MPPTMenor_float = Float.parseFloat(MPPTmenorVPV);
                    Float MPPTMaior_float = Float.parseFloat(MPPTmaiorVPV);
                    Float Coef_MPPT_float = Float.parseFloat(Coef_MPPTPV);
                    Float Imaxstring_float = Float.parseFloat(ImaxstringPV);
                    Intent intent = new Intent(Main2Activity_dados_inversor.this, Main3Activityinversor.class);

                    intent.putExtra("modeloInvPV", modeloInversoPV);
                    intent.putExtra("potnomInvPV",potnomInv_float);
                    intent.putExtra("numMPPTTrackers",numMPPTTrackers_float);
                    intent.putExtra("MpptMenorIv",MPPTMenor_float);
                    intent.putExtra("MpptMaiorInv",MPPTMaior_float);
                    intent.putExtra("CoefMPPT",Coef_MPPT_float);
                    intent.putExtra("ImaxstringPV", Imaxstring_float);

                    startActivity(intent);
                }

            }
        });

    }
}
