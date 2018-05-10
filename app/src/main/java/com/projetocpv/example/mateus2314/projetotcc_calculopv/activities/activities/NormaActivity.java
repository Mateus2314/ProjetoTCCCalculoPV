package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.R;

public class NormaActivity extends AppCompatActivity {

    private Button btvoltamainNorma;
    private WebView WebNorma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norma);

        WebNorma = (WebView) findViewById(R.id.WvNorma013);
        btvoltamainNorma = (Button) findViewById(R.id.btVoltarMainNorma);

        WebSettings webSettings = WebNorma.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebNorma.loadUrl("http://www.stackoverflow.com");

        btvoltamainNorma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormaActivity.this,MainActivity.class));
            }
        });
    }
}
