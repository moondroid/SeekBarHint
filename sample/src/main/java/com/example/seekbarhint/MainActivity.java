package com.example.seekbarhint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import it.moondroid.seekbarhint.library.SeekBarHint;


public class MainActivity extends AppCompatActivity implements SeekBarHint.OnSeekBarHintProgressChangeListener {

    private SeekBarHint mSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeekBar = (SeekBarHint) findViewById(R.id.seekbar);

        mSeekBar.setOnProgressChangeListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_fixed:
                mSeekBar.setPopupStyle(SeekBarHint.POPUP_FIXED);
                return true;

            case R.id.action_follow:
                mSeekBar.setPopupStyle(SeekBarHint.POPUP_FOLLOW);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public String onHintTextChanged(SeekBarHint seekBarHint, int progress) {
        //return "p: "+progress;
        return null;
    }
}
