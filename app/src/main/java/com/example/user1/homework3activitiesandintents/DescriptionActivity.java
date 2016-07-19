package com.example.user1.homework3activitiesandintents;

import android.content.Intent;
import android.renderscript.Byte2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DescriptionActivity extends AppCompatActivity {

    static EditText edtYears;
    static EditText edtAddress;
    static EditText edtCity;
    static EditText edtBirthDate;
    static  Button btnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        edtAddress = (EditText) findViewById(R.id.edtAddress);
        edtYears = (EditText) findViewById(R.id.edtYears);
        edtCity = (EditText) findViewById(R.id.edtCity);
        edtBirthDate = (EditText) findViewById(R.id.edtBithDate);
        btnContinue = (Button) findViewById(R.id.btn_continue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DescriptionActivity.this, FinalActivity.class));
            }
        });
    }
}
