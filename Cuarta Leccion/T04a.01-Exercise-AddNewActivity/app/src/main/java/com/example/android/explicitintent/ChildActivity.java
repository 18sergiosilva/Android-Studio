package com.example.android.explicitintent;

import android.os.Bundle;
import android.widget.TextView;



public class ChildActivity {
    TextView mDisplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);


        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }
}
