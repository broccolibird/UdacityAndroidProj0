package com.katmitchell.udacityappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.button_spotify_streamer).setOnClickListener(this);
        findViewById(R.id.button_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.button_library_app).setOnClickListener(this);
        findViewById(R.id.button_scores_app).setOnClickListener(this);
        findViewById(R.id.button_xyz_reader).setOnClickListener(this);
        findViewById(R.id.button_capstone).setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button_spotify_streamer:
                Toast.makeText(this, "This button will launch my Spotify Streamer app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_build_it_bigger:
                Toast.makeText(this, "This button will launch my Build It Bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_library_app:
                Toast.makeText(this, "This button will launch my Library app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_scores_app:
                Toast.makeText(this, "This button will launch my Scores app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_xyz_reader:
                Toast.makeText(this, "This button will launch my XYZ Reader app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(this, "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
