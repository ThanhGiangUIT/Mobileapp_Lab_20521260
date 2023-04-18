package com.example.mobile_labs01_20521260;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText Salary, Name;
    protected Button myBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Name = findViewById(R.id.Name);
            Salary = findViewById(R.id.Salary);
            myBtn = findViewById(R.id.calcBtn);
            myBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String text = Name.getText().toString();
                    double number = Double.parseDouble(Salary.getText().toString());
                    TinhLuong Salary = new TinhLuong(text, number);
                    Salary.calculationSalary();
                }
            });
        }
    }
