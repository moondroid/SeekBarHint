package com.example.seekbarhint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import it.moondroid.seekbarhint.library.SeekBarHint;


public class MainActivity extends AppCompatActivity {

    private SeekBarHint mSeekBarH;
    private SeekBarHint mSeekBarV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeekBarH = (SeekBarHint) findViewById(R.id.seekbar_horizontal);
        mSeekBarV = (SeekBarHint) findViewById(R.id.seekbar_vertical);

        mSeekBarH.setHintAdapter(new SeekBarHint.SeekBarHintAdapter() {
            @Override
            public String getHint(SeekBarHint seekBarHint, int progress) {
                return "Horizontal: " + progress;
            }
        });
        mSeekBarV.setHintAdapter(new SeekBarHint.SeekBarHintAdapter() {
            @Override
            public String getHint(SeekBarHint seekBarHint, int progress) {
                return "Vertical: " + progress;
            }
        });
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
                mSeekBarH.setPopupStyle(SeekBarHint.POPUP_FIXED);
                mSeekBarV.setPopupStyle(SeekBarHint.POPUP_FIXED);
                return true;

            case R.id.action_follow:
                mSeekBarH.setPopupStyle(SeekBarHint.POPUP_FOLLOW);
                mSeekBarV.setPopupStyle(SeekBarHint.POPUP_FOLLOW);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
