package com.uniso.lpdm.forcauniso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class JogoActivity extends AppCompatActivity {

    public final static String PALAVRA = "PALAVRA";
    public final static String CHANCES = "CHANCES";

    private String palavra;
    private int tentativasRestantes;
    private Map<String, String> palavrasTentadas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        Intent intent = getIntent();

        palavra = intent.getStringExtra(PALAVRA);
        tentativasRestantes = intent.getIntExtra(CHANCES, 0);
        palavrasTentadas = new HashMap<String, String>();
    }




}