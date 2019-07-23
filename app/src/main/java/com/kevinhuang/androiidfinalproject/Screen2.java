package com.kevinhuang.androiidfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {
    private Button mSetupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        mSetupButton = (Button) findViewById(R.id.setup_button);
        mSetupButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openScreen2();
            }
        });

    }
    public void openScreen2() {

        Intent intent = new Intent(this, Screen3.class);
        startActivity(intent);


    }
}
