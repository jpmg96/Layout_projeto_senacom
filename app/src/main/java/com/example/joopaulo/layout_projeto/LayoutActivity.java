package com.example.joopaulo.layout_projeto;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class LayoutActivity extends AppCompatActivity {

Button mapa_button, reclamações_button, estatísticas_button;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_layout);

        /*Trava tela e mantém ligada enquanto aplicativo está aberto*/
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        mapa_button = (Button) findViewById(R.id.mapa);
        reclamações_button = (Button) findViewById(R.id.reclamações);
        estatísticas_button = (Button) findViewById(R.id.estatisticas);

        mapa_button.setOnClickListener(new
                                           View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   startMapa(v);
                                               }
                                           });

        estatísticas_button.setOnClickListener(new
                                               View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       startEstatisticas(v);
                                                   }
                                               });
    }

    public void startMapa(View view) {
        Intent intent = new Intent();
        intent.setClass(this, mapa.class);
        startActivity(intent);
    }

    public void startEstatisticas(View view) {
        Intent intent = new Intent();
        intent.setClass(this, estatisticas.class);
        startActivity(intent);
    }


}
