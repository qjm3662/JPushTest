package com.example.qjm3662.jpushtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TimePicker timePicker = new TimePicker(this);
//        timePicker.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                JMessageClient.login("qjm3662", "1234567890", new BasicCallback() {
//                    @Override
//                    public void gotResult(int i, String s) {
//                        Log.e("sa dfsafs" + i, s);
//                        Log.e("" + i, s);
//                    }
//                });
//            }
//        }, 2000);

        EasyButton easyButton = (EasyButton) findViewById(R.id.sb_btn);
        easyButton.startAnimation();
    }


    /**

     * 开启View闪烁效果

     *

     * */

    private void startFlick( View view ){

        if( null == view ){

            return;

        }

        Animation alphaAnimation = new AlphaAnimation( 1, 0 );

        alphaAnimation.setDuration( 300 );

        alphaAnimation.setInterpolator( new LinearInterpolator( ) );

        alphaAnimation.setRepeatCount( Animation.INFINITE );

        alphaAnimation.setRepeatMode( Animation.REVERSE );

        view.startAnimation( alphaAnimation );

    }

    /**

     * 取消View闪烁效果

     *

     * */

    private void stopFlick( View view ){

        if( null == view ){

            return;

        }

        view.clearAnimation( );

    }


}
