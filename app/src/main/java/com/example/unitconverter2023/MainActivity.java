package com.example.unitconverter2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     // Declaring widgets
    EditText editText;
    TextView textView;
    TextView textView2;
    TextView textView4;
    TextView valueinpounds;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiating widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueinpounds = findViewById(R.id.valueOfPounds);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        // Adding a click event for button (Executing the convert method when clicked)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // calling convertfromkilotopound method
                ConvertFromKiloToPound();
            }
        });

    }

    private void ConvertFromKiloToPound() {
        // This method will convert the values entered in edittext
        //from kilo to pounds
        String ValueEnteredinKILO = editText.getText().toString();

        //converting string to number
        double Kilo = Double.parseDouble(ValueEnteredinKILO);

        // converting kilo to pounds formula

        double pounds = Kilo * 2.205;
        //Displaying the value resulted in textview
        textView4.setText("" + pounds);
    }
}