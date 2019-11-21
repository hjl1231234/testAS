package com.example.testas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    public static final String myLog = "acti";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new AnotherRightFragment());
                Intent intent = new Intent("com.example.testas.2");
                startActivity(intent);
        Toast.makeText(MainActivity.this, "You	clicked	Button	1", Toast.LENGTH_SHORT).show();
            }
        });
        replaceFragment(new RightFragment());


//显示调用
//                Intent intent	=	new	Intent(MainActivity.this,	Main2Activity.class);
        //所谓隐士调用
//                intent.addCategory("com.example.testas.MY_CATEGORY");

        Log.d(myLog, "create" + "  " + this + " " + getTaskId());
        ActivityCollector.addActivity(this);

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You	clicked	Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You	clicked	Remove", Toast.LENGTH_SHORT).show();
                break;
            case R.id.destroy_item:
                Toast.makeText(this, "You	clicked	destroy", Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myLog, "start" + "  " + this + " " + getTaskId());

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myLog, "resume" + "  " + this + " " + getTaskId());

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myLog, "pause" + "  " + this + " " + getTaskId());

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myLog, "stop" + "  " + this + " " + getTaskId());

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        ActivityCollector.removeActivity(this);
        Log.d(myLog, "restart" + "  " + this + " " + getTaskId());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(myLog, "destroy" + "  " + this + " " + getTaskId());
//        ActivityCollector.removeActivity(this);

    }
}
