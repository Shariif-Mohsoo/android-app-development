package com.example.testapp4;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            Log.d("On Create", "onCreate: method of main activity 2 is invoked");

            return insets;
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart", "onStart: method of main activity 2 is invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Onpause", "onPause: method of main activity 2 is invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("OnRestart", "onRestart: method of main activity 2 is invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("On Destory", "onDestroy: method of main activity 2 is invoked");
    }
}