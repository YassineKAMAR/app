package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class pk0 implements y2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f12918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f12919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final WeakReference f12920c;

    public pk0(dj0 dj0Var) {
        Context context = dj0Var.getContext();
        this.f12918a = context;
        this.f12919b = g2.t.r().D(context, dj0Var.v().f16723a);
        this.f12920c = new WeakReference(dj0Var);
    }

    static /* bridge */ /* synthetic */ void g(pk0 pk0Var, String str, Map map) {
        dj0 dj0Var = (dj0) pk0Var.f12920c.get();
        if (dj0Var != null) {
            dj0Var.U("onPrecacheEvent", map);
        }
    }

    public abstract void h();

    public final void k(String str, String str2, String str3, String str4) {
        jg0.f9600b.post(new ok0(this, str, str2, str3, str4));
    }

    protected final void l(String str, String str2, int i8) {
        jg0.f9600b.post(new mk0(this, str, str2, i8));
    }

    public final void n(String str, String str2, long j8) {
        jg0.f9600b.post(new nk0(this, str, str2, j8));
    }

    public final void o(String str, String str2, int i8, int i9, long j8, long j9, boolean z7, int i10, int i11) {
        jg0.f9600b.post(new lk0(this, str, str2, i8, i9, j8, j9, z7, i10, i11));
    }

    public final void p(String str, String str2, long j8, long j9, boolean z7, long j10, long j11, long j12, int i8, int i9) {
        jg0.f9600b.post(new kk0(this, str, str2, j8, j9, j10, j11, j12, z7, i8, i9));
    }

    protected void q(int i8) {
    }

    protected void r(int i8) {
    }

    @Override // y2.h
    public void release() {
    }

    protected void s(int i8) {
    }

    protected void t(int i8) {
    }

    public abstract boolean u(String str);

    public boolean v(String str, String[] strArr) {
        return u(str);
    }

    public boolean w(String str, String[] strArr, hk0 hk0Var) {
        return u(str);
    }
}
