package com.example.joopaulo.layout_projeto;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class estatisticas extends AppCompatActivity {
    ImageView voltar_main_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatisticas);

        voltar_main_button= (ImageView) findViewById(R.id.estatisticas_voltar_main);

         /*Trava tela e mantém ligada enquanto aplicativo está aberto*/
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void voltar_estatisticas_Main(View view) {
        Intent intent = new Intent();
        intent.setClass(this, LayoutActivity.class);
        startActivity(intent);
    }

}
