package com.carlosniper.sleep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Paso1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso1);
    }

    public void toPaso2(View view){
        Intent intent = new Intent(this, Paso2.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        String minutos = editText.getText().toString();
        intent.putExtra("MINUTOS", minutos);
        startActivity(intent);
    }
}
