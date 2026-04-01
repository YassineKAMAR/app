package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class iv2 implements g62 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f9383b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f9384a;

    public iv2(Handler handler) {
        this.f9384a = handler;
    }

    static /* bridge */ /* synthetic */ void a(hu2 hu2Var) {
        List list = f9383b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(hu2Var);
            }
        }
    }

    private static hu2 b() {
        hu2 hu2Var;
        List list = f9383b;
        synchronized (list) {
            hu2Var = list.isEmpty() ? new hu2(null) : (hu2) list.remove(list.size() - 1);
        }
        return hu2Var;
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final boolean F(int i8) {
        return this.f9384a.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final void c(int i8) {
        this.f9384a.removeMessages(i8);
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final f52 d(int i8) {
        Handler handler = this.f9384a;
        hu2 hu2VarB = b();
        hu2VarB.a(handler.obtainMessage(i8), this);
        return hu2VarB;
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final void e(Object obj) {
        this.f9384a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final f52 f(int i8, Object obj) {
        Handler handler = this.f9384a;
        hu2 hu2VarB = b();
        hu2VarB.a(handler.obtainMessage(i8, obj), this);
        return hu2VarB;
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final boolean g(int i8, long j8) {
        return this.f9384a.sendEmptyMessageAtTime(2, j8);
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final boolean h(Runnable runnable) {
        return this.f9384a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final boolean i(int i8) {
        return this.f9384a.sendEmptyMessage(i8);
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final Looper j() {
        return this.f9384a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final boolean k(f52 f52Var) {
        return ((hu2) f52Var).b(this.f9384a);
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final f52 l(int i8, int i9, int i10) {
        Handler handler = this.f9384a;
        hu2 hu2VarB = b();
        hu2VarB.a(handler.obtainMessage(1, i9, i10), this);
        return hu2VarB;
    }
}
