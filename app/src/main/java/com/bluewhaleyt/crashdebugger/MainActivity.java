package com.bluewhaleyt.crashdebugger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread.setDefaultUncaughtExceptionHandler(new CrashHandler(this));
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

        // crash the app
        btn.setOnClickListener(v -> btn.setTypeface(Typeface.createFromAsset(getAssets(), "")));

    }
}