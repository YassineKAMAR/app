package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class s40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static s40 f14517b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f14518a = new AtomicBoolean(false);

    s40() {
    }

    public static s40 a() {
        if (f14517b == null) {
            f14517b = new s40();
        }
        return f14517b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.f14518a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.r40
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                ns.a(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) h2.y.c().b(ns.f12085h0)).booleanValue());
                if (((Boolean) h2.y.c().b(ns.f12148o0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((ao0) ug0.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new sg0() { // from class: com.google.android.gms.internal.ads.q40
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.sg0
                        public final Object a(Object obj) {
                            return zn0.O5(obj);
                        }
                    })).W2(g3.b.k3(context2), new p40(o3.a.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | tg0 | NullPointerException e8) {
                    qg0.i("#007 Could not call remote method.", e8);
                }
            }
        });
        thread.start();
        return thread;
    }
}
