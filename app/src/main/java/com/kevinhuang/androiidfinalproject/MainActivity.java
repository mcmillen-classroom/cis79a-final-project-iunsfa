package com.kevinhuang.androiidfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mStartButton;
    private ImageView mBellIcon;
    private Animation fromBottom;
    private Animation fromTop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mStartButton = (Button) findViewById(R.id.start_button);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScreen();
            }
        });


        mBellIcon = (ImageView) findViewById(R.id.bell_icon);
        fromBottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        fromTop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        mStartButton.setAnimation(fromBottom);
        mBellIcon.setAnimation(fromTop);
    }

    public void openScreen() {

        Intent intent = new Intent(this, Screen2.class);
        startActivity(intent);


    }
}


