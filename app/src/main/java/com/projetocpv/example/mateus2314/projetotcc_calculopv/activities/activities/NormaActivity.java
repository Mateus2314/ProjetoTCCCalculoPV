package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.R;

import static com.projetocpv.example.mateus2314.projetotcc_calculopv.R.layout.activity_norma;

public class NormaActivity extends AppCompatActivity {

    private Button btvoltamainNorma;
    private WebView WebNorma;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_norma);

        WebNorma = (WebView) findViewById(R.id.WvNorma013);
        btvoltamainNorma = (Button) findViewById(R.id.btVoltarMainNorma);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = WebNorma.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebNorma.loadUrl("https://drive.google.com/file/d/1oBprhuQ3K-ufXz7RMFTs1tN8FNKqXS43/view?usp=sharing");
        WebNorma.setWebViewClient(new HelloWebViemClient());

        btvoltamainNorma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormaActivity.this,MainActivity.class));
            }
        });

    }

    private class HelloWebViemClient extends WebViewClient{

        @Override
        public void onPageStarted(WebView view, String url , Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String url){

            webView.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url){
            super.onPageFinished(view, url);

            progressBar.setVisibility(view.GONE);

        }



    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){

        if ((keyCode == KeyEvent.KEYCODE_BACK)&& WebNorma.canGoBack()){
            WebNorma.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }


    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                NormaActivity.this);

        // set title
        alertDialogBuilder.setTitle("Exit");

        // set dialog message
        alertDialogBuilder
                .setMessage("Do you really want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        NormaActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }

}
