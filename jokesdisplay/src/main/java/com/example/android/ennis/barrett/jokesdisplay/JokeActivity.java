package com.example.android.ennis.barrett.jokesdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "the_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getExtras().getString(JOKE_EXTRA);
        if (joke != null) {
            TextView textView = (TextView) findViewById(R.id.joke);
            textView.setText(joke);
        }

    }
}
