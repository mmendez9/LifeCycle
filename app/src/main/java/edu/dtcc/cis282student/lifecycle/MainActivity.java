package edu.dtcc.cis282student.lifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String tag = "Mayra's App Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "Creating...", Toast.LENGTH_LONG).show();

        Log.d(tag,"onCreate()");
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(), "Starting...", Toast.LENGTH_LONG).show();
        super.onStart();
        Log.d(tag, "onStart()");
    }

    @Override
    protected  void onResume() {
        Toast.makeText(getApplicationContext(), "Resuming...", Toast.LENGTH_LONG).show();
        super.onResume();
        Log.d(tag, "onResume()");
    }
    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(), "Restarting...", Toast.LENGTH_LONG).show();
        super.onRestart();
        Log.d(tag, "onRestart()");
    }
}
