package com.theah64.auto_skype.ui.activities.main;

import android.os.Bundle;

import com.theah64.auto_skype.R;
import com.theah64.auto_skype.ui.activities.base.BaseAppCompatActivity;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends BaseAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
