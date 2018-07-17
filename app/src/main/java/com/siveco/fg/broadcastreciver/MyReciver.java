package com.siveco.fg.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class MyReciver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("com.siveco.fg.broadcastreceiver.SOME_ACTION"))
            Toast.makeText(context, "SOME_ACTION is received", Toast.LENGTH_LONG).show();

    }
}
