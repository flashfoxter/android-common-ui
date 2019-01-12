package com.be.ui;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    public static final int icBack = R.drawable.ic_arrow_back;

    public void showBack() {
        getSupportActionBar().setHomeAsUpIndicator(ContextCompat.getDrawable(this, icBack));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void hideBack() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }

}
