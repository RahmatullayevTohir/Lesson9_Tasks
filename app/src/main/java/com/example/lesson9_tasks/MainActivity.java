package com.example.lesson9_tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3,button_next_tasks;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        button_next_tasks = findViewById(R.id.b_go_next_tasks);
        button1 = findViewById(R.id.b_bounce);
        button2 = findViewById(R.id.b_sequential);
        button3 = findViewById(R.id.b_togather);
        imageView = findViewById(R.id.imageView);

        button_next_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActiviy();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                imageView.startAnimation(animation);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
                imageView.startAnimation(animation);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.togather);
                imageView.startAnimation(animation);
            }
        });
    }
    public void openSecondActiviy(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}