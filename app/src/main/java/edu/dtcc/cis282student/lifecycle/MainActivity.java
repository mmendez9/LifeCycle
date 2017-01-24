package edu.dtcc.cis282student.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static String tag = "Mayra's App Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "Creating...", Toast.LENGTH_LONG).show();

        Log.d(tag,"onCreate()");

        if (savedInstanceState != null) {
            // Restore the saved data

        }
    }

    @Override
    protected void onStart() {
         super.onStart();
        Toast.makeText(getApplicationContext(), "Starting...", Toast.LENGTH_LONG).show();
        Log.d(tag, "onStart()");
    }

    @Override
    protected  void onResume() {
        Toast.makeText(getApplicationContext(), "Resuming...", Toast.LENGTH_LONG).show();
        super.onResume();
        Log.d(tag, "onResume()");
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "Pausing...", Toast.LENGTH_LONG).show();
        super.onPause();
        Log.d(tag, "onPause()");
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(), "Stopping...", Toast.LENGTH_LONG).show();
        super.onStop();
        Log.d(tag, "onStop()");
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(), "Restarting...", Toast.LENGTH_LONG).show();
        super.onRestart();
        Log.d(tag, "onRestart()");
    }

}
