package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class HelloWorld extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.helloworld);
    }
}
