package com.example.lesson9_tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class SecondActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    Button facebook, youtobe,twitter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
    }

    private void initViews() {
        lottieAnimationView = findViewById(R.id.animation);
        facebook = findViewById(R.id.b_facebook);
        youtobe = findViewById(R.id.b_youtube);
        twitter = findViewById(R.id.b_twitter);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.setAnimation("facebook.json");
                lottieAnimationView.playAnimation();
            }
        });
        youtobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.setAnimation("youtube.json");
                lottieAnimationView.playAnimation();
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.setAnimation("twitter.json");
                lottieAnimationView.playAnimation();
            }
        });

    }
}