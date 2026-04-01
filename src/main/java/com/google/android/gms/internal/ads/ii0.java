package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public abstract class ii0 extends TextureView implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final wi0 f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final hj0 f9220b;

    public ii0(Context context) {
        super(context);
        this.f9219a = new wi0();
        this.f9220b = new hj0(context, this);
    }

    public void B(int i8) {
    }

    public void C(int i8) {
    }

    public void D(int i8) {
    }

    public void e(int i8) {
    }

    public void g(int i8) {
    }

    public void h(String str, String[] strArr, Integer num) {
        w(str);
    }

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract long o();

    public abstract long p();

    public abstract String q();

    public abstract void r();

    public abstract void s();

    public abstract void t(int i8);

    public abstract void u(hi0 hi0Var);

    public abstract void v();

    public abstract void w(String str);

    public abstract void x();

    public abstract void y(float f8, float f9);

    public Integer z() {
        return null;
    }
}
