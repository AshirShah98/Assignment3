package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;

    private RadioButton radioButton1;
    private RadioButton radioButton2;

    private CheckBox checkBox1 , checkBox2 , checkBox3 , checkBox4;

    String str;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);

        checkBox1 = findViewById(R.id.cb1);
        checkBox2 = findViewById(R.id.cb2);
        checkBox3 = findViewById(R.id.cb3);
        checkBox4 = findViewById(R.id.cb4);

        button = findViewById(R.id.button);
    }

    public void ONClickFn(View view)
    {
        int check1 = radioGroup1.getCheckedRadioButtonId();
        int check2 = radioGroup2.getCheckedRadioButtonId();

        radioButton1 = findViewById(check1);
        radioButton2 = findViewById(check2);

        str = radioButton1.getText().toString().concat(" & ").concat(radioButton2.getText().toString());

        if(checkBox1.isChecked())
        {
            str = str.concat(" & ").concat(checkBox1.getText().toString());
        }

        if(checkBox2.isChecked())
        {
            str = str.concat(" & ").concat(checkBox2.getText().toString());
        }

        if(checkBox3.isChecked())
        {
            str = str.concat(" & ").concat(checkBox3.getText().toString());
        }

        if(checkBox4.isChecked())
        {
            str = str.concat(" & ").concat(checkBox4.getText().toString());
        }

        str = str.concat(" pressed...");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , assignment3_2.class);
                intent.putExtra("data" , str);
                startActivity(intent);
            }
        });
    }
}