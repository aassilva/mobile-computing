package br.ufg.inf.es.aula_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LIFECYCLE", "ONCREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("LIFECYCLE", "ONSTART");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("LIFECYCLE", "ONRESUME");
    }


    @Override
    protected void onPause() {

        super.onPause();

        Log.d("LIFECYCLE", "ONPAUSE");
    }

    @Override
    protected void onStop() {

        super.onStop();

        Log.d("LIFECYCLE", "ONSTOP");
    }

    @Override
    protected void onRestart() {

        super.onRestart();

        Log.d("LIFECYCLE", "ONRESTART");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

        Log.d("LIFECYCLE", "ONDESTROY");
    }

    public void push(View view) {
        TextView = findViewById();
        labelName.
    }

}
