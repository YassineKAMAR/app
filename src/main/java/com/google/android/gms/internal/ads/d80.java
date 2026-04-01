package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d80 extends a.AbstractC0073a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6610a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6611b;

    public d80(pv pvVar) {
        try {
            this.f6611b = pvVar.q();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            this.f6611b = "";
        }
        try {
            for (Object obj : pvVar.o()) {
                wv wvVarO5 = obj instanceof IBinder ? vv.O5((IBinder) obj) : null;
                if (wvVarO5 != null) {
                    this.f6610a.add(new e80(wvVarO5));
                }
            }
        } catch (RemoteException e9) {
            qg0.e("", e9);
        }
    }
}
