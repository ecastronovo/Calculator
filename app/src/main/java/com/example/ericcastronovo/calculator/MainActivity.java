package com.example.ericcastronovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText field1;
    EditText field2;
    String value1;
    String value2;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String[] getFields(){
        String[] strArr = {"", ""};
        field1 = findViewById(R.id.editText1);
        field2 = findViewById(R.id.editText2);
        value1 = field1.getText().toString();
        value2 = field2.getText().toString();
        strArr[0] = value1;
        strArr[1] = value2;
        return strArr;
    }
    public void add(View view) {
        String[] fields = getFields();
        if ( fields[0].matches("") |fields[1].matches("") ){
            result = "One or more number fields have been left blank";
        }
        else {
            result = Float.toString((Float.parseFloat(value1) + Float.parseFloat(value2)));
        }
        TextView textView = findViewById(R.id.textView1);
        textView.setText(result);
        }

    public void sub(View view) {
        String[] fields = getFields();
        if ( fields[0].matches("") |fields[1].matches("") ){
            result = "One or more number fields have been left blank";
        }
        else {
            result = Float.toString((Float.parseFloat(value1) - Float.parseFloat(value2)));
        }

        TextView textView = findViewById(R.id.textView1);
        textView.setText(result);
    }
    public void mul(View view) {
        String[] fields = getFields();
        if ( fields[0].matches("") |fields[1].matches("") ){
            result = "One or more number fields have been left blank";
        }
        else {
            result = Float.toString((Float.parseFloat(value1) * Float.parseFloat(value2)));
        }
        TextView textView = findViewById(R.id.textView1);
        textView.setText(result);
    }
    public void div(View view) {
        String[] fields = getFields();
        if ( fields[0].matches("") | fields[1].matches("") ){
            result = "One or more number fields have been left blank";
        }
        else if ( fields[1].matches("0"))
        {
            result = "Cannot divide by Zero";
        }
        else {
            result = Float.toString((Float.parseFloat(value1) / Float.parseFloat(value2)));
        }
        TextView textView = findViewById(R.id.textView1);
        textView.setText(result);
    }

}
