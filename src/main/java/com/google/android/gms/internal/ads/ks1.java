package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ks1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f10312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f10313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f10314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f10315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f10316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f10317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f10318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f10319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w84 f10320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w84 f10321j;

    public ks1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8, w84 w84Var9, w84 w84Var10) {
        this.f10312a = w84Var;
        this.f10313b = w84Var2;
        this.f10314c = w84Var3;
        this.f10315d = w84Var4;
        this.f10316e = w84Var5;
        this.f10317f = w84Var6;
        this.f10318g = w84Var7;
        this.f10319h = w84Var8;
        this.f10320i = w84Var9;
        this.f10321j = w84Var10;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Executor executor = (Executor) this.f10312a.k();
        Context contextA = ((io0) this.f10313b).a();
        WeakReference weakReferenceA = ((jo0) this.f10314c).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new js1(executor, contextA, weakReferenceA, lg3Var, (xn1) this.f10316e.k(), (ScheduledExecutorService) this.f10317f.k(), (oq1) this.f10318g.k(), ((uo0) this.f10319h).a(), ((kb1) this.f10320i).k(), (ty2) this.f10321j.k());
    }
}
