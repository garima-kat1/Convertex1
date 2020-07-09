package com.codee.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clkButton(View view){
        EditText DollarId = (EditText) findViewById(R.id.DollarId);
        String dollar = DollarId.getText().toString();
        Double dollars = Double.parseDouble(dollar);
        Double INR = 74.94 * dollars;
        String toastText = " = Rs. " + INR.toString();
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
