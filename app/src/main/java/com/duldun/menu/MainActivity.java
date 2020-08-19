package com.duldun.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout menuOne = findViewById(R.id.menu_one);
        TranslateAnimation mAnimation ;
        mAnimation = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, -1f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f);
        mAnimation.setDuration(500);
        mAnimation.setRepeatMode(Animation.REVERSE);
        mAnimation.setInterpolator(new LinearInterpolator());
        menuOne.setAnimation(mAnimation);

        menuOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(menuOne, "scaleX", 1f, 0f);
                final ObjectAnimator oa2 = ObjectAnimator.ofFloat(menuOne, "scaleX", 0f, 1f);
                oa1.setInterpolator(new DecelerateInterpolator());
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        menuOne.setBackgroundResource(R.drawable.menu_click);
                        oa2.start();
                    }
                });
                oa1.start();

                int SPLASH_DISPLAY_LENGTH = 1000;
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {
                        menuOne.setBackgroundResource(R.drawable.menu_one);
                    }
                }, SPLASH_DISPLAY_LENGTH);
            }
        });

        final RelativeLayout menuTwo = findViewById(R.id.menu_two);
        TranslateAnimation mAnimation2 ;
        mAnimation2 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, -1f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f);
        mAnimation2.setDuration(650);
        mAnimation2.setRepeatMode(Animation.REVERSE);
        mAnimation2.setInterpolator(new LinearInterpolator());
        menuTwo.setAnimation(mAnimation2);
        menuTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(menuTwo, "scaleX", 1f, 0f);
                final ObjectAnimator oa2 = ObjectAnimator.ofFloat(menuTwo, "scaleX", 0f, 1f);
                oa1.setInterpolator(new DecelerateInterpolator());
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        menuTwo.setBackgroundResource(R.drawable.menu_click);
                        oa2.start();
                    }
                });
                oa1.start();

                int SPLASH_DISPLAY_LENGTH = 1000;
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {
                        menuTwo.setBackgroundResource(R.drawable.menu_two);
                    }
                }, SPLASH_DISPLAY_LENGTH);
            }
        });

        final RelativeLayout menuThree = findViewById(R.id.menu_three);
        TranslateAnimation mAnimation3 ;
        mAnimation3 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, -1f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f);
        mAnimation3.setDuration(770);
        mAnimation3.setRepeatMode(Animation.REVERSE);
        mAnimation3.setInterpolator(new LinearInterpolator());
        menuThree.setAnimation(mAnimation3);

        menuThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(menuThree, "scaleX", 1f, 0f);
                final ObjectAnimator oa2 = ObjectAnimator.ofFloat(menuThree, "scaleX", 0f, 1f);
                oa1.setInterpolator(new DecelerateInterpolator());
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        menuThree.setBackgroundResource(R.drawable.menu_click);
                        oa2.start();
                    }
                });
                oa1.start();

                int SPLASH_DISPLAY_LENGTH = 1000;
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {
                        menuThree.setBackgroundResource(R.drawable.menu_three);
                    }
                }, SPLASH_DISPLAY_LENGTH);
            }
        });

        final RelativeLayout menuFour = findViewById(R.id.menu_four);
        TranslateAnimation mAnimation4 ;
        mAnimation4 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, -1f,
                TranslateAnimation.RELATIVE_TO_PARENT,0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.0f);
        mAnimation4.setDuration(840);
        mAnimation4.setRepeatMode(Animation.REVERSE);
        mAnimation4.setInterpolator(new LinearInterpolator());
        menuFour.setAnimation(mAnimation4);

        menuFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(menuFour, "scaleX", 1f, 0f);
                final ObjectAnimator oa2 = ObjectAnimator.ofFloat(menuFour, "scaleX", 0f, 1f);
                oa1.setInterpolator(new DecelerateInterpolator());
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        menuFour.setBackgroundResource(R.drawable.menu_click);
                        oa2.start();
                    }
                });
                oa1.start();
                int SPLASH_DISPLAY_LENGTH = 1000;
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {
                        menuFour.setBackgroundResource(R.drawable.menu_four);
                    }
                }, SPLASH_DISPLAY_LENGTH);
            }
        });

    }
}