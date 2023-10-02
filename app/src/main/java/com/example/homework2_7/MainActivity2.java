package com.example.homework2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
    public void onNextClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void toggleHeartColor(View view) {
        ImageView heartImageView = (ImageView) view;
        ColorDrawable drawable = (ColorDrawable) heartImageView.getBackground();
        int currentColor = drawable.getColor();

        int newColor = (currentColor == getResources().getColor(R.color.pressed_color)) ?
                getResources().getColor(R.color.normal_color) : getResources().getColor(R.color.pressed_color);

        heartImageView.setBackgroundColor(newColor);
    }

}