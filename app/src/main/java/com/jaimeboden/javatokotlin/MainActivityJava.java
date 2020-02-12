package com.jaimeboden.javatokotlin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityJava extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
        init();
    }

    public void init() {
        Button buttonJava = findViewById(R.id.buttonJava);
        Button buttonKotlin = findViewById(R.id.buttonKotlin);
        Button buttonSwitchKotlin = findViewById(R.id.buttonSwitchKotlin);

        buttonJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                javaHelper();
            }
        });

        buttonKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kotlinHelper();
            }
        });

        buttonSwitchKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToKotlin();
            }
        });
    }

    private void javaHelper() {
        JavaHelper jh = new JavaHelper();
        jh.sayHello(this);
    }

    private void kotlinHelper() {
        KotlinHelper kh = new KotlinHelper();
        kh.sayHello(this);
    }

    private void switchToKotlin() {
        Intent kotlinIntent = new Intent(this,MainActivityKotlin.class);
        startActivity(kotlinIntent);
    }
}
