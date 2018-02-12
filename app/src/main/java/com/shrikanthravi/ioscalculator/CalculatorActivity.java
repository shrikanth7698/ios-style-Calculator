package com.shrikanthravi.ioscalculator;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;

public class CalculatorActivity extends AppCompatActivity {

    MaterialRippleLayout zeroMRL,oneMRL,twoMRL,threeMRL,fourMRL,fiveMRL,sixMRL,sevenMRL,eightMRL,nineMRL,clearMRL,negateMRL,percentageMRL,divideMRL,multiplyMRL,minusMRL,plusMRL,equaltoMRL;
    TextView answerTV;
    AutoResizeTextView equationTV;
    float textSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_calculator);

        Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/product_san_regular.ttf");
        Typeface bold = Typeface.createFromAsset(getAssets(),"fonts/product_sans_bold.ttf");
        final FontChanger fontChanger = new FontChanger(regular);
        final FontChanger fontChanger1 = new FontChanger(bold);
        fontChanger1.replaceFonts((ViewGroup)this.findViewById(android.R.id.content));

        zeroMRL = findViewById(R.id.zeroMRL);
        oneMRL = findViewById(R.id.oneMRL);
        twoMRL = findViewById(R.id.twoMRL);
        threeMRL = findViewById(R.id.threeMRL);
        fourMRL = findViewById(R.id.fourMRL);
        fiveMRL = findViewById(R.id.fiveMRL);
        sixMRL = findViewById(R.id.sixMRL);
        sevenMRL = findViewById(R.id.sevenMRL);
        eightMRL = findViewById(R.id.eightMRL);
        nineMRL = findViewById(R.id.nineMRL);
        clearMRL = findViewById(R.id.clearMRL);
        negateMRL = findViewById(R.id.negateMRL);
        percentageMRL = findViewById(R.id.percentageMRL);
        divideMRL = findViewById(R.id.dividelMRL);
        multiplyMRL = findViewById(R.id.multiplyMRL);
        minusMRL = findViewById(R.id.minusMRL);
        plusMRL = findViewById(R.id.plusMRL);
        equaltoMRL = findViewById(R.id.equalToMRL);

        equationTV = findViewById(R.id.equationTV);
        textSize = equationTV.getTextSize();
        answerTV = findViewById(R.id.answerTV);

        equationTV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        zeroMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(equationTV.getText().toString().length()!=0){
                    equationTV.setText(equationTV.getText().toString()+"0");
                }

            }
        });

        oneMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"1");
            }
        });

        twoMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"2");
            }
        });

        threeMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"3");
            }
        });

        fourMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"4");
            }
        });

        fiveMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"5");
            }
        });

        sixMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"6");
            }
        });

        sevenMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"7");
            }
        });

        eightMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"8");
            }
        });

        nineMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText(equationTV.getText().toString()+"9");
            }
        });

        clearMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equationTV.setText("");
                recreate();
            }
        });

        negateMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        percentageMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        divideMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        multiplyMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        minusMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        plusMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        equaltoMRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
