package com.example.testapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button add, subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue + secondValue;
                tvAns.setText(String.valueOf(ans));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue - secondValue;
                tvAns.setText(String.valueOf(ans));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue * secondValue;
                tvAns.setText(String.valueOf(ans));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                if(secondValue!=0) {
                    ans = firstValue / secondValue;
                    tvAns.setText(String.valueOf(ans));
                }else{
                    tvAns.setText(R.string.can_t_divide_by_0);
                }
            }
        });

    }
}