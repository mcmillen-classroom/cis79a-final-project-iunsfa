package com.kevinhuang.androiidfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen3 extends AppCompatActivity implements View.OnClickListener {
    private Button mSlot1;
    private Button mSlot2;
    private Button mSlot3;
    private Button mSlot4;
    private Button mSlot5;
    private Button mSlot6;
    private Button mSlot7;
    private Button mSlot8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        mSlot1 = (Button) findViewById(R.id.slot_1);
        mSlot2 = (Button) findViewById(R.id.slot_2);
        mSlot3 = (Button) findViewById(R.id.slot_3);
        mSlot4 = (Button) findViewById(R.id.slot_4);
        mSlot5 = (Button) findViewById(R.id.slot_5);
        mSlot6 = (Button) findViewById(R.id.slot_6);
        mSlot7 = (Button) findViewById(R.id.slot_7);
        mSlot8 = (Button) findViewById(R.id.slot_8);

        mSlot1.setOnClickListener(this);
        mSlot2.setOnClickListener(this);
        mSlot3.setOnClickListener(this);
        mSlot4.setOnClickListener(this);
        mSlot5.setOnClickListener(this);
        mSlot6.setOnClickListener(this);
        mSlot7.setOnClickListener(this);
        mSlot8.setOnClickListener(this);





    }
        public void openMap(){
            Intent intent = new Intent(this, MapsActivity.class);
            startActivity(intent);

        }

    @Override
    public void onClick(View view) {
        openMap();
    }
}

