package com.jaimeboden.javatokotlin;

import android.app.Activity;
import android.widget.Toast;

public class JavaHelper {
    public void sayHello(Activity activity) {
        Toast.makeText(activity, "Hello From Java!", Toast.LENGTH_LONG).show();
    }
}