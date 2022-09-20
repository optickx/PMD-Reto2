package com.example.pmd_reto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button
        button1 = null, button2 = null,
        button3 = null, button4 = null,
        button5 = null, button6 = null,
        button7 = null, button8 = null,
        button9 = null, button0 = null,
        buttonPlus = null, buttonMinus = null,
        buttonEquals = null;

    private TextView text = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}