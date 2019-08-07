package com.dvt.day5animaton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgFly, imgSign, imgHand;
    private TextView tvTranslate, tvAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgFly = findViewById(R.id.img_translate);
        imgHand = findViewById(R.id.img_scale);
        imgSign = findViewById(R.id.img_rotate);
        imgSign.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Animation rotateAnimation = AnimationUtils
                                .loadAnimation(MainActivity.this,
                                        R.anim.rotate_animation);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setRepeatCount(0);
                imgSign.startAnimation(rotateAnimation);
            }
        });

        imgFly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                TranslateAnimation translateAnimation
//                        = (TranslateAnimation) AnimationUtils.loadAnimation(
//                        MainActivity.this,
//                        R.anim.translate_animation);
//                translateAnimation.setDuration(2000);
//                translateAnimation.setRepeatCount(10);
//                imgFly.startAnimation(translateAnimation);

                TranslateAnimation translateAnimation = new TranslateAnimation(
                        TranslateAnimation.RELATIVE_TO_SELF, 0.0f,
                        TranslateAnimation.RELATIVE_TO_SELF, 0.0f,
                        TranslateAnimation.RELATIVE_TO_PARENT, 0.0f,
                        TranslateAnimation.RELATIVE_TO_PARENT, -0.9f
                );
                translateAnimation.setDuration(5000);
                translateAnimation.setRepeatCount(10);
                translateAnimation.setRepeatMode(Animation.REVERSE);
                imgFly.startAnimation(translateAnimation);
            }
        });

        imgHand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation =
                        AnimationUtils.loadAnimation(MainActivity.this,
                                R.anim.scale_animation);
                imgHand.startAnimation(animation);
            }
        });
        tvTranslate = findViewById(R.id.tv_translate);
        tvTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotateAnimation =
                        AnimationUtils.loadAnimation(MainActivity.this, R.anim.demo_translate_text);
                tvTranslate.startAnimation(rotateAnimation);
            }
        });

        tvAlpha = findViewById(R.id.tv_alpha);
        tvAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alphaAnimation =
                        AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha_animation);
                tvAlpha.startAnimation(alphaAnimation);
            }
        });
    }
}
