package com.ltts.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton batman, superman, ironman, spiderman, captainamerica, captainmarvel;
    Button submit;
    String selectedsuperhero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batman = (RadioButton) findViewById(R.id.batman);
        superman = (RadioButton) findViewById(R.id.superman);
        ironman = (RadioButton) findViewById(R.id.ironman);
        spiderman = (RadioButton) findViewById(R.id.spiderman);
        captainamerica = (RadioButton) findViewById(R.id.captainamerica);
        captainmarvel = (RadioButton) findViewById(R.id.captainmarvel);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(batman.isChecked()) {
                    selectedsuperhero = batman.getText().toString();
                } else if(superman.isChecked()) {
                    selectedsuperhero = superman.getText().toString();
                } else if(ironman.isChecked()) {
                    selectedsuperhero = ironman.getText().toString();
                } else if(spiderman.isChecked()) {
                    selectedsuperhero = spiderman.getText().toString();
                } else if(captainamerica.isChecked()) {
                    selectedsuperhero = captainamerica.getText().toString();
                } else if(captainmarvel.isChecked()) {
                    selectedsuperhero = captainmarvel.getText().toString();
                }
                Toast.makeText(getApplicationContext(),selectedsuperhero,Toast.LENGTH_LONG).show();
            }
        });
    }
}