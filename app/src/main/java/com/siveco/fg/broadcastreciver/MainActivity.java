package com.siveco.fg.broadcastreciver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    MyReciver receiver;
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);

        receiver = new MyReciver();
        intentFilter = new IntentFilter("com.siveco.fg.broadcastreceiver.SOME_ACTION");

    }

    @Override
    protected void onResume() {
        super.onResume();

        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        unregisterReceiver(receiver);
    }

    public void onClickBtn(View view) {

        Intent intent = new Intent("com.siveco.fg.broadcastreceiver.SOME_ACTION");
        sendBroadcast(intent);
    }
}
