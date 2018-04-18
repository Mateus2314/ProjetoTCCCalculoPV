package com.projetocpv.example.mateus2314.projetotcc_calculopv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupPadraoEntra;
    private RadioButton radioButtonpadraoEntra;
    private Button botaoSeguir1;
    private Button buttonCalculeAgora;
    private EditText usuarioId;
    private EditText contaEnergiaid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupPadraoEntra = (RadioGroup) findViewById(R.id.radioGroupidentrada);
        botaoSeguir1 = (Button) findViewById(R.id.botaoseguir1id);
        buttonCalculeAgora = (Button)findViewById(R.id.buttonCalculeAgora);
        usuarioId = (EditText) findViewById(R.id.editTxtNome);
        contaEnergiaid = (EditText) findViewById(R.id.EditTxtContaLuz);

        

        botaoSeguir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario_pv = usuarioId.getText().toString();
                String conta_pv = contaEnergiaid.getText().toString();

                if (conta_pv.isEmpty() || usuario_pv.isEmpty()){
                    Toast.makeText(MainActivity.this, "Preencha os dados pedidos", Toast.LENGTH_LONG).show();
                }else {
                    Float conta_float = Float.parseFloat(conta_pv);
                    int idRadioButtonEscolhido = radioGroupPadraoEntra.getCheckedRadioButtonId();
                        if (idRadioButtonEscolhido > 0){
                            radioButtonpadraoEntra = (RadioButton) findViewById(idRadioButtonEscolhido);
                            // Intent intent_padrao1 = new Intent(MainActivity.this,Main2Activity_dados_inversor.class);
                            //intent_padrao1.putExtra("tipo_entrada",radioButtonpadraoEntra.getText());

                            startActivity(new Intent(MainActivity.this,Main2Activity_dados_inversor.class));
                        }else{
                            Toast.makeText(MainActivity.this,"Escolha um padrão" +
                                    " de entrada",Toast.LENGTH_LONG).show();
                        }
                }
            }
        });
        buttonCalculeAgora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario_pv = usuarioId.getText().toString();
                String conta_pv = contaEnergiaid.getText().toString();
                if (conta_pv.isEmpty()||usuario_pv.isEmpty()){
                    Toast.makeText(MainActivity.this, "Preencha os dados pedidos", Toast.LENGTH_LONG).show();
                }else {
                    Float conta_float2 = Float.parseFloat(conta_pv);
                    Intent intent_padrao1 = new Intent(MainActivity.this, CalculeAgoraInicioActivity.class);
                    intent_padrao1.putExtra("contaEnergia",conta_float2);
                    startActivity(new Intent(MainActivity.this,CalculeAgoraInicioActivity.class));
                }
            }
        });

        

    }
}
