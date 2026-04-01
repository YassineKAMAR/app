package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.w40;
import h2.v;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            v.a().j(this, new w40()).I0(intent);
        } catch (RemoteException e8) {
            qg0.d("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }
}
