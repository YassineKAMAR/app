package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ok f5909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f5910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f5911c;

    public bo() {
        this.f5911c = fg0.f7750b;
    }

    public bo(final Context context) {
        ExecutorService executorService = fg0.f7750b;
        this.f5911c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wn
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.M4)).booleanValue();
                bo boVar = this.f16824a;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        boVar.f5909a = (ok) ug0.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new sg0() { // from class: com.google.android.gms.internal.ads.xn
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.sg0
                            public final Object a(Object obj) {
                                return nk.O5(obj);
                            }
                        });
                        boVar.f5909a.U4(g3.b.k3(context2), "GMA_SDK");
                        boVar.f5910b = true;
                    } catch (RemoteException | tg0 | NullPointerException unused) {
                        qg0.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
