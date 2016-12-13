package com.renxl.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        final TextView tvRotation = (TextView) findViewById(R.id.tv_rotation);
        tvRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotation);
                tvRotation.startAnimation(anim);
            }
        });

        final TextView tvScale = (TextView) findViewById(R.id.tv_scale);
        tvScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_scale);
                tvScale.startAnimation(anim);
            }
        });

        final TextView tvAlpha = (TextView) findViewById(R.id.tv_alpha);
        tvAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha);
                tvAlpha.startAnimation(anim);
            }
        });

        final TextView tvTranslate = (TextView) findViewById(R.id.tv_translate);
        tvTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_translate);
                tvTranslate.startAnimation(anim);
            }
        });

    }
}
