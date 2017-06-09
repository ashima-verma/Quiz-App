package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void submit(View view) {
        ans = 0;
        RadioButton r2 = (RadioButton) findViewById(R.id.r2);
        RadioButton r6 = (RadioButton) findViewById(R.id.r6);

        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.cb4);
        CheckBox cb5 = (CheckBox) findViewById(R.id.cb5);
        CheckBox cb6 = (CheckBox) findViewById(R.id.cb6);
        CheckBox cb7 = (CheckBox) findViewById(R.id.cb7);

        EditText a1 = (EditText) findViewById(R.id.a1);
        EditText n1 = (EditText) findViewById(R.id.n1);
        TextView t1 = (TextView) findViewById(R.id.t1);


        String text1 = "private";
        if (a1.getText().toString().equalsIgnoreCase(text1)) {
            ans++;
        }
        if (cb1.isChecked() && cb2.isChecked() && !(cb3.isChecked()) && !(cb4.isChecked())) {
            ans++;
        }
        if (r2.isChecked()) {
            ans++;
        }
        if (r6.isChecked()) {
            ans++;
        }


        if (cb5.isChecked() && cb6.isChecked() && !(cb7.isChecked())) {
            ans++;
        }


        t1.setText(n1.getText().toString() + ", you have " + ans + " Correct Answers.");
        Toast.makeText(this, n1.getText().toString() + ", you have " + ans + " Correct Answer", Toast.LENGTH_SHORT).show();
    }
}


