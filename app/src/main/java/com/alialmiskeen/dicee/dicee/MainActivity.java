package com.alialmiskeen.dicee.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze Button has been clicked");
                Random random = new Random();
                for(int i = 1;i < 3; i++){
                    int rand = (random.nextInt()%6) + 1;
                    rand = rand < 0? rand * -1 : rand;
                    Log.d("Random : ", Integer.toString(rand));
                    switch (rand){
                        case 1:
                            if(i == 1){
                                leftDice.setImageResource(R.drawable.dice1);
                            }else
                                rightDice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            if(i == 1){
                                leftDice.setImageResource(R.drawable.dice2);
                            }else
                                rightDice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            if(i == 1){
                                leftDice.setImageResource(R.drawable.dice3);
                            }else
                                rightDice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            if(i == 1){
                                leftDice.setImageResource(R.drawable.dice4);
                            }else
                                rightDice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            if(i == 1){
                                leftDice.setImageResource(R.drawable.dice5);
                            }else
                                rightDice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            if(i == 1){
                                leftDice.setImageResource(R.drawable.dice6);
                            }else
                                rightDice.setImageResource(R.drawable.dice6);
                            break;
                    }


                }

                //
            }
        });
    }
}
