package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){
            public void onTick(long milliSeconds){

                Log.i("Hello",String.valueOf(milliSeconds/1000));   

            }
            public void onFinish(){
                Log.i("I am done","Clock stop ticking");
            }
        }.start();
       /* final Handler handler=new Handler();
        Runnable run=new Runnable() {
            @Override
            public void run() {
                Log.i("Hi,","Hello I am running");
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);
        */
    }
}