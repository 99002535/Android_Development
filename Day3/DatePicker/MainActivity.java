package com.ltts.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView date;
    DatePicker simpledatePicker;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //intitiate the view's

        simpledatePicker = (DatePicker) findViewById(R.id.simpleDatePicker);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = "Day = "+ simpledatePicker.getDayOfMonth();
                String month = "Month = "+ (simpledatePicker.getMonth()+1);
                String year = "Year = "+ simpledatePicker.getYear();
                Toast.makeText(getApplicationContext(),day+"\n"+month+"\n"+year,Toast.LENGTH_LONG).show();


            }
        });

    }
}