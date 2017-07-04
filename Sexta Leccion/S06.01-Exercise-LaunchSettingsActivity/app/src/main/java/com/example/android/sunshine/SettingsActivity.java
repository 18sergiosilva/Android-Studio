package com.example.android.sunshine;

import android.os.Bundle;

/**
 * Created by elizabeth on 03/07/2017.
 */

public class SettingsActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_settings);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
