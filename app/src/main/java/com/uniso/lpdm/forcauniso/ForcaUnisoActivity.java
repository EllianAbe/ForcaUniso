package com.uniso.lpdm.forcauniso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class ForcaUnisoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forca_uniso);
    }

    public void onClickJogar(View view) {
        String palavra =  ((EditText) findViewById(R.id.editTextPalavra)).getText().toString();
        String chances =  ((EditText) findViewById(R.id.editTextChances)).getText().toString();

        Intent intent = new Intent(this, JogoActivity.class);

        intent.putExtra(JogoActivity.PALAVRA, palavra);
        intent.putExtra(JogoActivity.CHANCES, Integer.parseInt(chances));

        startActivity(intent);
    }
}