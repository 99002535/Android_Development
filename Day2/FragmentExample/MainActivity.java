package com.ltts.fragmentexample;
import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

        Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = (Button) findViewById(R.id.FirstFragment);
        secondFragment = (Button) findViewById(R.id.SecondFragment);

        final Bundle bundle = new Bundle();
        bundle.putString("message", "From Activity to Fragment");

        //perform setOnClickListener event on first button
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new firstfragment());
            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new secondfragment());
            }
        });

    }
    private void loadFragment(Fragment fragment){
        //Set Fragment class arguments
        //create fragment manager
        FragmentManager fm = getFragmentManager();
        //create a fragmentTransaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //Replace the framelayout with new fragment
        fragmentTransaction.replace(R.id.FrameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}