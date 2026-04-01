package com.amazon.device.simplesignin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.device.simplesignin.a.c;

/* JADX INFO: loaded from: classes.dex */
public class BroadcastHandler extends BroadcastReceiver {
    private static final String TAG = BroadcastHandler.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            c.a().a(context, intent);
        } catch (Exception e8) {
            Log.e(TAG, "Error in BroadcastReceiver onReceive: " + e8);
        }
    }
}
