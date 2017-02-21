package edu.dtcc.cis282student.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static String tag = "Mayra's App Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"onCreate()");
        Toast.makeText(getApplicationContext(), "Creating...",
                Toast.LENGTH_LONG).show();// Toast Message
    }

    @Override
    protected void onStart() {
         super.onStart();
        Log.d(tag, "onStart()");// Log Message
        Toast.makeText(getApplicationContext(), "Starting...",
                Toast.LENGTH_LONG).show();// Toast Message
    }

    @Override
    protected  void onResume() {
        super.onResume();
        Log.d(tag, "onResume()"); // Log Message
        Toast.makeText(getApplicationContext(), "Resuming...",
                Toast.LENGTH_LONG).show();// Toast Message
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause()");// Log Message
        Toast.makeText(getApplicationContext(), "Pausing...",
                Toast.LENGTH_LONG).show();// Toast Message
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop()");// Log Message
        Toast.makeText(getApplicationContext(), "Stopping...",
                Toast.LENGTH_LONG).show();// Toast Message
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart()");// Log Message
        Toast.makeText(getApplicationContext(), "Restarting...",
                Toast.LENGTH_LONG).show();// Toast Message
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy()");// Log Message
        Toast.makeText(getApplicationContext(), "Destroying...",
                Toast.LENGTH_LONG).show();// Toast Message
    }
}
