package com.carlosniper.sleep;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.jorgecastillo.FillableLoader;
import com.github.jorgecastillo.FillableLoaderBuilder;
import com.github.jorgecastillo.clippingtransforms.ClippingTransform;

public class Paso2 extends AppCompatActivity {

    private static final long TICK = 1000;

    FillableLoader fillableLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso2);

        fillableLoader = (FillableLoader)findViewById(R.id.fillableLoader);

        String minutos = this.getIntent().getStringExtra("MINUTOS");
        int segundos = Integer.parseInt(minutos);
        segundos = (segundos * 60);

        FillableLoaderBuilder loaderBuilder = new FillableLoaderBuilder();
        fillableLoader = loaderBuilder.svgPath(Paths.GITHUB)
                .fillDuration(segundos)
                .strokeColor(Color.parseColor("#1c9ade"))
                .strokeWidth(1)
                .strokeDrawingDuration(2000)
                .originalDimensions(970, 970)
                .fillColor(Color.parseColor("#1c9ade")).build();
    }
}
