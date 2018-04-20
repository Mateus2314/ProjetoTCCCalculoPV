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
    private EditText Fat_pot_inv;
    private EditText THD_inv;
    private EditText Vmaxcc;
    private EditText Imaxstring;
    private EditText Freqrede;
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
        Fat_pot_inv = (EditText) findViewById(R.id.Id_fator_pot);
        THD_inv = (EditText) findViewById(R.id.id_THD);
        Vmaxcc = (EditText) findViewById(R.id.idVmaxcc);
        Imaxstring = (EditText) findViewById(R.id.IdcorrenteMaxStr);
        Freqrede = (EditText) findViewById(R.id.idFreqRede);
        seguir3act = (Button) findViewById(R.id.idbuttonseguiact3);
        volta1act = (Button) findViewById(R.id.idvoltar);

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
                String Fat_pot_invPV = Fat_pot_inv.getText().toString();
                String THD_invPV = THD_inv.getText().toString();
                String VmaxccPV = Vmaxcc.getText().toString();
                String ImaxstringPV = Imaxstring.getText().toString();
                String FreqredePV = Freqrede.getText().toString();
                String seguir3actPV = seguir3act.getText().toString();
                String volta1actPV = volta1act.getText().toString();
                if (modeloInversoPV.isEmpty() || potnomInvPV.isEmpty() || numMPPTTrackersPV.isEmpty()||
                        MPPTmenorVPV.isEmpty() || MPPTmaiorVPV.isEmpty() || Coef_MPPTPV.isEmpty()||
                        Fat_pot_invPV.isEmpty() || THD_invPV.isEmpty() || VmaxccPV.isEmpty() ||
                        ImaxstringPV.isEmpty() || FreqredePV.isEmpty() || seguir3actPV.isEmpty()||
                        volta1actPV.isEmpty()){
                    Toast.makeText(Main2Activity_dados_inversor.this,"Preencha os dados pedidos",Toast.LENGTH_LONG).show();
                }else {
                    Float potnomInv_float = Float.parseFloat(potnomInvPV);
                    Float numMPPTTrackers_float = Float.parseFloat(numMPPTTrackersPV);
                    Float MPPTMenor_float = Float.parseFloat(MPPTmenorVPV);
                    Float MPPTMaior_float = Float.parseFloat(MPPTmaiorVPV);
                    Float Coef_MPPT_float = Float.parseFloat(Coef_MPPTPV);
                    Float Fat_pot_inv_float = Float.parseFloat(Fat_pot_invPV);
                    Float THD_invPV_float = Float.parseFloat(THD_invPV);
                    Float VmaxccPV_float = Float.parseFloat(VmaxccPV);
                    Float Imaxsttring_float = Float.parseFloat(VmaxccPV);
                    Float Freqrede_float = Float.parseFloat(FreqredePV);
                    startActivity(new Intent(Main2Activity_dados_inversor.this,Main3Activityinversor.class));
                }

            }
        });

    }
}