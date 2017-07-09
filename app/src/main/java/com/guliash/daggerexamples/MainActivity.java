package com.guliash.daggerexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerComponentC.builder().componentB(
                DaggerComponentB.builder().componentA(
                        DaggerComponentA.create()
                ).build()
        ).build().plus().inject(this);
    }
}
