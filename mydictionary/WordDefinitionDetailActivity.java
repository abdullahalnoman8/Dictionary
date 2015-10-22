package com.softmaker.gazi_opu.mydictionary;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;


public class WordDefinitionDetailActivity extends ActionBarActivity {

    TextView wordTextView;
    TextView definitionTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_definition_detail);
        wordTextView=(TextView) findViewById(R.id.wordTextView);
        definitionTextView=(TextView) findViewById(R.id.definitionTextView);


        Log.d("DICTIONARY", "third activity started");



        wordTextView.setText(getIntent().getStringExtra("word"));
        String text = getIntent().getStringExtra("definition");
        definitionTextView.setText(getIntent().getStringExtra("definition"));

    }

}
