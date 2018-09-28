package com.tr4ing4ng.sean.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private enum Operator{none,add,minus,divide,multiply}
    private double data1 = 0, data2 = 0;
    private Operator operator = Operator.none;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnResultClick(View view){

        if(operator != Operator.none){
            EditText editText = (EditText)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(editText.getText().toString());
            double result = 0;
            switch(operator) {
                case add:
                    result = data1 + data2;
                    break;
                case minus:
                    result = data1 - data2;
                    break;
                case multiply:
                    result = data1 * data2;
                    break;
                case divide:
                    result = data1 / data2;
                    break;
            }
            operator = Operator.none;
            data1 = result;
            if((result-(int)result)!=0){
                editText.setText(String.valueOf(result));
            }else{
                editText.setText(String.valueOf((int)result));
            }
        }
    }

    public void btnClearClick(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText("");
    }

    public void btnAddClick(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        operator = Operator.add;
        data1 = Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }

    public void btnMinusClick(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        operator = Operator.minus;
        data1 = Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }

    public void btnMultiplyClick(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        operator = Operator.multiply;
        data1 = Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }

    public void btnDivideClick(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        operator = Operator.divide;
        data1 = Double.parseDouble(editText.getText().toString());
        editText.setText("");
    }

    public void btnDotClick(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+".");
    }
    public void btn00Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"0");
    }

    public void btn01Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"1");
    }

    public void btn02Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"2");
    }

    public void btn03Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"3");
    }

    public void btn04Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"4");
    }

    public void btn05Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"5");
    }

    public void btn06Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"6");
    }

    public void btn07Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"7");
    }

    public void btn08Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"8");
    }

    public void btn09Click(View view){
        EditText editText = (EditText)findViewById(R.id.resultEdit);
        editText.setText(editText.getText()+"9");
    }
}
