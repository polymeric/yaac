package com.mycotech.yaac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String oldVal = "";
    private String curVal = "";
    private String operation = "";
    private String memStore = "";
    private TextView oldValTxtView;
    private TextView curOperationTxtView;
    private TextView curValTxtView;
    private TextView statusTextView;
    private Float result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oldValTxtView = findViewById(R.id.oldValTxtView);
        curOperationTxtView = findViewById(R.id.curOperationTxtView);
        curValTxtView = findViewById(R.id.curValTxtView);
        statusTextView = findViewById(R.id.statusTextView);

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
                curVal = curVal.concat("1");
                setCurVal();
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("2");
                setCurVal();
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("3");
                setCurVal();
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("4");
                setCurVal();
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("5");
                setCurVal();
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("6");
                setCurVal();
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("7");
                setCurVal();
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("8");
                setCurVal();
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("9");
                setCurVal();
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat("0");
                setCurVal();
            }
        });

        decimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curVal = curVal.concat(".");
                setCurVal();
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("/");
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("*");
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("-");
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("+");
            }
        });

        clrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldValTxtView.setText("");
                oldVal = "";
                curOperationTxtView.setText("");
                operation = "";
                curValTxtView.setText("0");
                curVal = "";
            }
        });

        memBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memStore = curVal;
                statusTextView.setText("M+");
            }
        });

        clrMemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (memStore.equals(curVal)) {
                    memStore = "";
                    curValTxtView.setText("0");
                    statusTextView.setText("");
                } else {
                    curValTxtView.setText(memStore);
                    curVal = memStore;
                }
            }
        });

        backSpaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //remove last character
                if (curVal.length() > 0) {
                    curVal = curVal.substring(0, curVal.length() - 1);
                    curValTxtView.setText(curVal);
                }
            }
        });

    }


    private void setCurVal() {
        curValTxtView.setText(curVal);
    }

    private void setOperation(String curOp) {
        operation = curOp;
        curOperationTxtView.setText(operation);
        oldValTxtView.setText(curVal);
        oldVal = curVal;
        curVal = "";
        curValTxtView.setText("0");
    }

    private void calculate() {
        if (operation != null) {
            switch (operation) {
                case "/":
                    result = Float.parseFloat(oldVal) / Float.parseFloat(curVal);
                    break;
                case "*":
                    result = Float.parseFloat(oldVal) * Float.parseFloat(curVal);
                    break;
                case "-":
                    result = Float.parseFloat(oldVal) - Float.parseFloat(curVal);
                    break;
                case "+":
                    result = Float.parseFloat(oldVal) + Float.parseFloat(curVal);
                    break;

            }
            curOperationTxtView.setText("=");
            String tmpVal = oldVal.concat(operation).concat(curVal);
            oldValTxtView.setText(tmpVal);
            String parsedResult = result.toString();
            parsedResult = parsedResult.indexOf(".") < 0 ? parsedResult : parsedResult.replaceAll("0*$", "").replaceAll("\\.$", "");
            curValTxtView.setText(parsedResult);
            curVal = String.valueOf(parsedResult);
        }
    }
}
