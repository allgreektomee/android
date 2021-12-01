package com.example.day1project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        LinearLayout mainLayout = new LinearLayout(this); // 객체정보를 담고있는 객체
        // new 뷰 객체를 만들때 Context 객체가 전달되어야 한다.
        // 안드로이드 특징이고 AppCompatActivity 클래스는 Context를 상속하므로
        // this를 Context객체로 사용할 수 있다.

        mainLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
                //LayoutParams 가로 세로 지정
        );

        Button button1 = new Button(this);
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);

        setContentView(mainLayout);
    }

}