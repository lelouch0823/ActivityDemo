package com.bjw.activitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2016/6/29 0029.
 */
public class DialogActivity extends Activity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("hello");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("hello");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("hello");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.d("hello");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.d("hello");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.d("hello");
    }

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_activity);
        Logger.d("hello");
    }
}
