package com.workshop.studentlist;

import android.content.Intent;
import android.icu.lang.UCharacterEnums;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddStudent extends AppCompatActivity {

    EditText etName, etAge, etCourse;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        etAge = (EditText) findViewById(R.id.etAge);
        etCourse = (EditText)findViewById(R.id.etCourse);
        etName = (EditText)findViewById(R.id.etName);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("name", etName.getText().toString());
                i.putExtra("age", etAge.getText().toString());
                i.putExtra("course",etCourse.getText().toString());
                startActivity(i);
            }
        });
    }
}
