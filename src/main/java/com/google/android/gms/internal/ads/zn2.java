package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zn2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static zn2 f18296e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f18297a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f18298b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f18299c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18300d = 0;

    private zn2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new ym2(this, null), intentFilter);
    }

    public static synchronized zn2 b(Context context) {
        if (f18296e == null) {
            f18296e = new zn2(context);
        }
        return f18296e;
    }

    static /* synthetic */ void c(zn2 zn2Var, int i8) {
        synchronized (zn2Var.f18299c) {
            if (zn2Var.f18300d == i8) {
                return;
            }
            zn2Var.f18300d = i8;
            for (WeakReference weakReference : zn2Var.f18298b) {
                zq4 zq4Var = (zq4) weakReference.get();
                if (zq4Var != null) {
                    zq4Var.f18380a.h(i8);
                } else {
                    zn2Var.f18298b.remove(weakReference);
                }
            }
        }
    }

    public final int a() {
        int i8;
        synchronized (this.f18299c) {
            i8 = this.f18300d;
        }
        return i8;
    }

    public final void d(final zq4 zq4Var) {
        for (WeakReference weakReference : this.f18298b) {
            if (weakReference.get() == null) {
                this.f18298b.remove(weakReference);
            }
        }
        this.f18298b.add(new WeakReference(zq4Var));
        this.f18297a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tj2
            @Override // java.lang.Runnable
            public final void run() {
                zq4Var.f18380a.h(this.f15131a.a());
            }
        });
    }
}
