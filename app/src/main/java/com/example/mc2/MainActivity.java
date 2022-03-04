package com.example.mc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b8,b,b9,b10;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById((R.id.button4));
        b4=(Button)findViewById(R.id.button5);
        b5=(Button)findViewById(R.id.button6);
        b6=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b=(Button)findViewById(R.id.button);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);

        t1 = (TextView) findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomout);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.slideright);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(anim);

            }
        });




        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            t1.clearAnimation();

            }
        });
    }
}
