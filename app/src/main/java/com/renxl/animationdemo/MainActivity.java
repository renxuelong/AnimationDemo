package com.renxl.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initView();
        initViewCode();

    }

    private void initViewCode() {
        final TextView tvRotation = (TextView) findViewById(R.id.tv_rotation);
        tvRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RotateAnimation rotateAnimation = new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotateAnimation.setDuration(2000);
                tvRotation.startAnimation(rotateAnimation);
            }
        });

        final TextView tvScale = (TextView) findViewById(R.id.tv_scale);
        tvScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scaleAnimation.setDuration(2000);
                tvScale.startAnimation(scaleAnimation);
            }
        });
        final TextView tvAlpha = (TextView) findViewById(R.id.tv_alpha);
        tvAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
                alphaAnimation.setDuration(2000);
                tvAlpha.startAnimation(alphaAnimation);
            }
        });
        final TextView tvTranslate = (TextView) findViewById(R.id.tv_translate);
        tvTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 1, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 1);
                translateAnimation.setDuration(2000);
                tvTranslate.startAnimation(translateAnimation);
            }
        });
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
