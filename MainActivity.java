package com.example.appaudioalejandra;

import android.app.Activity;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import android.content.Intent;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Agregar animaciones de arriba a abajo
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);

        //Agregar animaciones de arriba a abajo
       //Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);
       //Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView audiotextview = findViewById(R.id.audiotextView);
        ImageView logoimageview = findViewById(R.id.logoimageView);

        audiotextview.setAnimation(animation1);
        logoimageview.setAnimation(animation2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);

    }
}
