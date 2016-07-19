package com.example.user1.homework3activitiesandintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        txtInfo = (TextView) findViewById(R.id.txt_info);
        txtInfo.setText(String.valueOf(MainActivity.edtName.getText().toString() + ", "
                + DescriptionActivity.edtYears.getText().toString() + "\n"
                + DescriptionActivity.edtAddress.getText().toString()
                + ", \nCity " + DescriptionActivity.edtCity.getText().toString()));

    }
}
