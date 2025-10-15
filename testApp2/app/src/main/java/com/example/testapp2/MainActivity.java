package com.example.testapp2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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
            Button rollButton = findViewById(R.id.Roll_btn);
            final ImageView leftDice = findViewById(R.id.image_leftDice);
            final ImageView rightDice = findViewById(R.id.image_rightDice);

            final int [] diceArray={
                    R.drawable.dice_1,
                    R.drawable.dice_2,
                    R.drawable.dice_3,
                    R.drawable.dice_4,
                    R.drawable.dice_5,
                    R.drawable.dice_6
            };

            rollButton.setOnClickListener(new View.OnClickListener(){
               public void onClick(View v){
                   Random rand = new Random();
                   int num1 = rand.nextInt(6);
                   int num2 = rand.nextInt(6);
                   leftDice.setImageResource(diceArray[num1]);
                   rightDice.setImageResource(diceArray[num2]);
               }
            });
    }
}