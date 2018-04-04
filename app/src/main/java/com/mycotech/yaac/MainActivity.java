package com.mycotech.yaac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String oldVal = "";
    private String curVal = "";
    private String result = "";
    private String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView oldValTxtView = findViewById(R.id.oldValTxtView);
        final TextView curOperationTxtView = findViewById(R.id.curOperationTxtView);
        final TextView curValTxtView = findViewById(R.id.curValTxtView);

        Button oneBtn = findViewById(R.id.oneBtn);
        Button twoBtn = findViewById(R.id.twoBtn);
        Button threeBtn = findViewById(R.id.threeBtn);
        Button fourBtn = findViewById(R.id.fourBtn);
        Button fiveBtn = findViewById(R.id.fiveBtn);
        Button sixBtn = findViewById(R.id.sixBtn);
        Button sevenBtn = findViewById(R.id.sevenBtn);
        Button eightBtn = findViewById(R.id.eightBtn);
        Button nineBtn = findViewById(R.id.nineBtn);
        Button zeroBtn = findViewById(R.id.zeroBtn);
        Button decimalBtn = findViewById(R.id.decimalBtn);
        Button equalBtn = findViewById(R.id.equalBtn);

        Button divBtn = findViewById(R.id.divBtn);
        Button multiplyBtn = findViewById(R.id.multiplyBtn);
        Button subBtn = findViewById(R.id.subtractBtn);
        Button addBtn = findViewById(R.id.addBtn);

        Button memBtn = findViewById(R.id.memBtn);
        Button clrMemBtn = findViewById(R.id.clrMemBtn);
        Button clrBtn = findViewById(R.id.clrBtn);
        Button backSpaceBtn = findViewById(R.id.backSpaceBtn);


        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("2");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("3");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("4");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("5");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("6");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("7");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("8");
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("9");
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat("0");
            }
        });

        decimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal.concat(".");
            }
        });



    }
}
