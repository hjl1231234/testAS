package com.example.testas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.example.testas.MainActivity.myLog;

public class Main4Activity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        button= findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.testas.5");
                startActivity(intent);
            }
        });

        Log.d(myLog,"create"+"  "+this+"    "+getTaskId());
        ActivityCollector.addActivity(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myLog,"start"+"  "+this+"    "+getTaskId());

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myLog,"resume"+"  "+this+"    "+getTaskId());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myLog,"pause"+"  "+this+"    "+getTaskId());

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myLog,"stop"+"  "+this+"    "+getTaskId());

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(myLog,"restart"+"  "+this+"    "+getTaskId());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(myLog,"destroy"+"  "+this+"    "+getTaskId());
//        ActivityCollector.removeActivity(this);
    }
}
