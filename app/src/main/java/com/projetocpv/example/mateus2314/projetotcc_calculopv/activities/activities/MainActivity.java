package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.R;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.config.Database;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model.Usuario;


public class MainActivity extends AppCompatActivity {

    private Database db;
    private EditText et_nome;
    private EditText et_contaener;
    private EditText et_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        // Impede que o teclado não abra assim que entrar a na tela

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }

    /* Cadastro do usuario */

    public void funcao_inversores(View view) {
        try {
            db = new Database(this);
            db.open();
            String nome = et_nome.getText().toString();
            String email = et_email.getText().toString();
            String contEne = et_contaener.getText().toString();


            if (nome.isEmpty() || email.isEmpty() || contEne.isEmpty()) {
                Toast.makeText(this,"Preencha todo os campos...",Toast.LENGTH_SHORT).show();
            }else {

               boolean isOk = Database.usuarioDao.save(new Usuario(nome, email, contEne));

               if (isOk){

                   Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                   Intent intent = new Intent(this, Main2Activity_dados_inversor.class);
                   startActivity(intent);
               }else {
                   Toast.makeText(this,"Falha ao cadastrar usuário!",Toast.LENGTH_SHORT).show();
               }

            }
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Falha ao cadastrar usuário!",Toast.LENGTH_SHORT).show();
        }finally {
            db.close();
        }
    }


    public void modulo(View view) {
        try {
            db = new Database(this);
            db.open();
            String nome = et_nome.getText().toString();
            String email = et_email.getText().toString();
            String contaEner = et_contaener.getText().toString();

            if (nome.isEmpty() || email.isEmpty() || contaEner.isEmpty()) {
                Toast.makeText(this,"Preencha todo os campos...",Toast.LENGTH_SHORT).show();
            }else {
                boolean isOk = Database.usuarioDao.save(new Usuario(nome, email, contaEner));
                if (isOk){

                    Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, Main4ActivityModulo.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(this,"Falha ao cadastrar usuário!",Toast.LENGTH_SHORT).show();
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Falha ao cadastrar usuário!",Toast.LENGTH_SHORT).show();
        }finally {
            db.close();
        }
    }

    public void calculeAgora(View view) {
        try {
            db = new Database(this);
            db.open();
            String nome = et_nome.getText().toString();
            String email = et_email.getText().toString();
            String contaEner = et_contaener.getText().toString();

            if (nome.isEmpty() || email.isEmpty() || contaEner.isEmpty()) {
                Toast.makeText(this,"Preencha todo os campos...",Toast.LENGTH_SHORT).show();
            }else {

                boolean isOk = Database.usuarioDao.save(new Usuario(nome, email, contaEner));
                if (isOk) {

                    Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, CalculeAgoraInicioActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Falha ao cadastrar usuário!", Toast.LENGTH_SHORT).show();
                }
            }


        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Falha ao cadastrar usuário!",Toast.LENGTH_SHORT).show();
        }finally {
            db.close();
        }
    }





    private void findViews() {
        et_nome = (EditText) findViewById(R.id.editTxtNome);
        et_contaener = (EditText) findViewById(R.id.et_contaener);
        et_email = (EditText) findViewById(R.id.et_EmailAct1);



    }
/** --------------------------------------------------------- **/



        

}

