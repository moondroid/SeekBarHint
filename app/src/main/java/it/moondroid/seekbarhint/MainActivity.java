package it.moondroid.seekbarhint;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import it.moondroid.seekbarhint.library.SeekBarHint;

public class MainActivity extends Activity implements SeekBarHint.OnSeekBarHintProgressChangeListener {

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
        switch (item.getItemId()){
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
