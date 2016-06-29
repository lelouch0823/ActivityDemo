package com.bjw.activitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2016/6/29 0029.
 */
public class MainActivity extends Activity {
    public static final String TAG = "你好啊";
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("hello");
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("hello");;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("hello");;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("hello");;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.d("hello");;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d("hello");;
    }

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_activity);

        Logger.d("hello");

        Button nb = (Button) findViewById(R.id.nor_button);
        Button db = (Button) findViewById(R.id.Dia_button);

        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.START_ACTION");
                startActivity(intent);
            }
        });
    }
}
