package com.example.testas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.testas.MainActivity.myLog;

public class Main2Activity extends AppCompatActivity {
    Button button;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button=findViewById(R.id.button_2);
        button1=findViewById(R.id.button_to3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.testas.3");
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
