package com.example.testas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.example.testas.MainActivity.myLog;

public class Main3Activity extends AppCompatActivity {
Button button3;
Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        button3=findViewById(R.id.button_3);
        button4=findViewById(R.id.button_4);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent	intent	=	new	Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.testas.4");
//                intent.setData();
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
