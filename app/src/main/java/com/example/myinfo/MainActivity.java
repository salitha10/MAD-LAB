package com.example.myinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Objects
    TextView regNoView, nameView, batchNoView;
    EditText regNoTxt, nameTxt, batchNoTxt;
    Button btnRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize objects
        regNoView = findViewById(R.id.regNoView);
        nameView = findViewById(R.id.nameView);
        batchNoView = findViewById(R.id.batchNoView);

        regNoTxt = findViewById(R.id.regNoTxt);
        nameTxt = findViewById(R.id.nameTxt);
        batchNoTxt =findViewById(R.id.batchTxt);

        btnRun = findViewById(R.id.runBtn);

    }

    @Override
    public void onResume(){
        super.onResume();

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regNoView.setText(regNoTxt.getText().toString());
                nameView.setText(nameTxt.getText().toString());
                batchNoView.setText(batchNoTxt.getText().toString());
            }
        });

    }

    }

