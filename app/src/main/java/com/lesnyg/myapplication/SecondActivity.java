package com.lesnyg.myapplication;

import android.content.Intent;
import android.icu.text.LocaleDisplayNames;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");

        resultTextView = findViewById(R.id.secondTextView);
        resultTextView.setText(age+"살 "+ name);

        Log.d(TAG,"onCreate: name:"+name);
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    public void receivBtnonClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("result",resultTextView.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
