package com.jaimeboden.javatokotlin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivityJava extends Activity {

    @BindView(R.id.buttonJava) Button buttonJava;
    @BindView(R.id.buttonKotlin) Button buttonKotlin;
    @BindView(R.id.buttonSwitchKotlin) Button buttonSwitchKotlin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonJava)
    public void initJavaHelper() {
        JavaHelper jh = new JavaHelper();
        jh.sayHello(this);
    }

    @OnClick(R.id.buttonKotlin)
    public void initKotlinHelper() {
        KotlinHelper kh = new KotlinHelper();
        kh.sayHello(this);
    }

    @OnClick(R.id.buttonSwitchKotlin)
    public void switchToKotlin() {
        Intent kotlinIntent = new Intent(this,MainActivityKotlin.class);
        startActivity(kotlinIntent);
    }
}
