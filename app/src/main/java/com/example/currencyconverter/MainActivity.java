package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                String euro = editTextNumber.getText().toString();
                double eurodouble = Double.parseDouble(euro);

                double poundsdouble = 0.89 * eurodouble;

                // String poundString = Double.toString(poundsdouble);
                String poundString = String.format("%.2f", poundsdouble);

                Toast.makeText(MainActivity.this, "€" + euro + " is " + " £" + poundString, Toast.LENGTH_LONG).show();
            }
        });

    }


}