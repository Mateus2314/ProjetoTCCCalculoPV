package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.R;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.config.Database;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model.Inversor;


public class Main2Activity_dados_inversor extends AppCompatActivity {

    private Database db;
    private EditText et_modeloInversor;
    private EditText et_potnomInv;
    private EditText et_numMPPTTrackers;
    private EditText et_MPPTmenorV;
    private EditText et_MPPTmaiorV;
    private EditText et_Coef_MPPT;
    private EditText et_Imaxstring;
    private EditText et_efic_rend_inv;
    private EditText et_PotenciaMaxEntrada_inv;
    private EditText et_TensaoMaximaCASaida;
    private EditText et_TensaoFaseNeutro;

   // private Button ;
   // private Button volta1act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_dados_inversor);

        //Bundle extra = getIntent().getExtras();
        // if(extra != null){
        //     String padraoEntrada2 = extra.getString("tipo_entrada");
        // }

        findViews();

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        // cadastro do invesor
    }

        public void salvarInversores(View view){
            try {
                db = new Database(this);
                db.open();
                String modelInversePV = et_modeloInversor.getText().toString();
                String potnomInvPV = et_potnomInv.getText().toString();
                String numMPPTTrackersPV = et_numMPPTTrackers.getText().toString();
                String MPPTmenorVPV = et_MPPTmenorV.getText().toString();
                String MPPTmaiorVPV = et_MPPTmaiorV.getText().toString();
                String Coef_MPPTPV = et_Coef_MPPT.getText().toString();
                String ImaxstringPV = et_Imaxstring.getText().toString();
                String rendimentoInvPV = et_efic_rend_inv.getText().toString();
                String PontenciaMaxEntradaPV = et_PotenciaMaxEntrada_inv.getText().toString();
                String TensaoMaximaCASaidaPV = et_TensaoMaximaCASaida.getText().toString();
                String TensaoFaseNeutroPV = et_TensaoFaseNeutro.getText().toString();


                if (modelInversePV.isEmpty() || potnomInvPV.isEmpty() || numMPPTTrackersPV.isEmpty()||
                        MPPTmenorVPV.isEmpty() || MPPTmaiorVPV.isEmpty() || Coef_MPPTPV.isEmpty()||
                        ImaxstringPV.isEmpty()|| rendimentoInvPV.isEmpty() || PontenciaMaxEntradaPV.isEmpty()
                        || TensaoMaximaCASaidaPV.isEmpty() || TensaoFaseNeutroPV.isEmpty()){
                    Toast.makeText(this, "Preencha todos os campos...",Toast.LENGTH_LONG).show();
                }else {
                    boolean isOk = Database.inversorDao.save(new Inversor(modelInversePV, potnomInvPV, numMPPTTrackersPV, MPPTmaiorVPV, MPPTmenorVPV, Coef_MPPTPV, ImaxstringPV,
                            rendimentoInvPV, PontenciaMaxEntradaPV, TensaoMaximaCASaidaPV, TensaoFaseNeutroPV));

                    if (isOk){
                        Toast.makeText(this, "Cadastro com sucesso!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(this, MainActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(this,"Falha ao cadastrar o inversoraqui!",Toast.LENGTH_LONG).show();
                    }
                }


            }catch (Exception e){
                e.printStackTrace();
                Toast.makeText(this,"Falha ao cadastrar inversor! aqui 2",Toast.LENGTH_LONG).show();
            }finally {
                db.close();
            }
        }





    private  void findViews(){

        et_modeloInversor = (EditText) findViewById(R.id.et_modelo_inversor);
        et_potnomInv = (EditText) findViewById(R.id.id_pot_nominal);
        et_numMPPTTrackers = (EditText) findViewById(R.id.idnumTracMPPT);
        et_MPPTmenorV = (EditText) findViewById(R.id.idmenor_mppt);
        et_MPPTmaiorV = (EditText) findViewById(R.id.et_maiorMPPT);
        et_Coef_MPPT = (EditText) findViewById(R.id.id_coefi_MPPT);
        et_Imaxstring = (EditText) findViewById(R.id.IdcorrenteMaxStr);
        et_efic_rend_inv = (EditText) findViewById(R.id.edit_rend_inv);
        et_PotenciaMaxEntrada_inv = (EditText) findViewById(R.id.ed_PotenciaMaxEntraInv);
        et_TensaoMaximaCASaida = (EditText) findViewById(R.id.editTensaoMax_SaidaInv);
        et_TensaoFaseNeutro = (EditText) findViewById(R.id.edTensaoFaseNeutro);
        }
}
