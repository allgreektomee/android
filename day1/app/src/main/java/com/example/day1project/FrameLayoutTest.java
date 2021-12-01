package com.example.day1project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class FrameLayoutTest extends AppCompatActivity {
    ImageView imgAOS;
    ImageView imgIOS;

    int flagImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_1_framelayout);

        imgAOS = findViewById(R.id.aos);
        imgIOS = findViewById(R.id.ios);

    }

    public void onButtonClicked(View v){

        if(flagImg == 0){
            flagImg = 1;
            imgAOS.setVisibility(View.VISIBLE);
            imgIOS.setVisibility(View.INVISIBLE);
        }else if(flagImg == 1){
            flagImg = 0;
            imgAOS.setVisibility(View.INVISIBLE);
            imgIOS.setVisibility(View.VISIBLE);
        }
    }
}