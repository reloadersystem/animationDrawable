package com.example.silvia.choisepanel;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        ImageView loading= findViewById(R.id.imageView);

        animationDrawable= (AnimationDrawable)loading.getDrawable();


    }


    public void start(View v) {
        animationDrawable.start();
    }

    public void stop(View v)
    {
        animationDrawable.stop();
    }

}
