package com.mairyu.app8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtHealthy = (TextView) findViewById(R.id.txtHealthy);
        final CheckBox chxHealthyYes = (CheckBox) findViewById(R.id.chxHealthyYes);
        final CheckBox chxHealthyNo = (CheckBox) findViewById(R.id.chxHealthyNo);

        TextView txtTrueAndTrue = (TextView) findViewById(R.id.txtTrueAndTrue);
        final CheckBox chxTrueAndTrueYes = (CheckBox) findViewById(R.id.chxTrueAndTrueYes);
        final CheckBox chxTrueAndTrueNo = (CheckBox) findViewById(R.id.chxTrueAndTrueNo);

        chxHealthyYes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (chxHealthyYes.isChecked()) {
                    chxHealthyNo.setChecked(false);
                }
            }
        });

        chxHealthyNo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (chxHealthyNo.isChecked()) {
                    chxHealthyYes.setChecked(false);
                }
            }
        });

        boolean amIHealthy = true;
        int power = 70;

/*        if (amIHealthy) {
            chxHealthyYes.setChecked(true);
        } else {
            chxHealthyNo.setChecked(true);
        }*/

        amIHealthy = (power > 70 ? true : false);

        chxHealthyYes.setChecked(power > 70 ? true : false);
        chxHealthyNo.setChecked(power > 70 ? false : true);

//        Log.i("LOG: ", power + "");

        boolean trueAndTrue = (true && true);

        if (trueAndTrue) {

        }
    }
}
