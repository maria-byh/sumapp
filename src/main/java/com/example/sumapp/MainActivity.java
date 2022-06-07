package com.example.testdam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myresult;
    EditText numberone, numbertwo;
    Button mysum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myresult = findViewById(R.id.my_result);
        numberone = findViewById(R.id.numberone);
        numbertwo = findViewById(R.id.numbertwo);
        mysum = findViewById(R.id.button);
    }

    public void clickSum(View view) {
        double stnumber = Double.parseDouble(numberone.getText().toString());
        double ndnumber = Double.parseDouble(numberone.getText().toString());
        myresult.setText("Result : " + (stnumber + ndnumber));
    }
}