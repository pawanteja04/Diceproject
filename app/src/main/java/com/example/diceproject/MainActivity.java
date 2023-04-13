package com.example.diceproject;

import static com.example.diceproject.R.id.dice_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView diceImage;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(dice_image);
        diceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateDice();
            }
        });
    }

    private void rotateDice() {
        int i = random.nextInt(5)+1;
//      Animation anim = AnimationUtils.loadAnimation(this,R.anim.rotate);
//        diceImage.startAnimation(anim);
        switch (i){
            case 1:
                diceImage.setImageResource(R.drawable.image1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.image2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.image3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.image4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.image5);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.image6);
                break;

        }

    }
}
