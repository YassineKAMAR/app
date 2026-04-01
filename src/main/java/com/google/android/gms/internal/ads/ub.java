package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ub implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fc f15587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f15591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yb f15592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f15593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private xb f15594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private cb f15596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private tb f15597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final hb f15598l;

    public ub(int i8, String str, yb ybVar) {
        Uri uri;
        String host;
        this.f15587a = fc.f7715c ? new fc() : null;
        this.f15591e = new Object();
        int iHashCode = 0;
        this.f15595i = false;
        this.f15596j = null;
        this.f15588b = i8;
        this.f15589c = str;
        this.f15592f = ybVar;
        this.f15598l = new hb();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f15590d = iHashCode;
    }

    final void A(tb tbVar) {
        synchronized (this.f15591e) {
            this.f15597k = tbVar;
        }
    }

    public final boolean B() {
        boolean z7;
        synchronized (this.f15591e) {
            z7 = this.f15595i;
        }
        return z7;
    }

    public final boolean C() {
        synchronized (this.f15591e) {
        }
        return false;
    }

    public byte[] D() {
        return null;
    }

    public final hb E() {
        return this.f15598l;
    }

    public final int a() {
        return this.f15598l.b();
    }

    public final int c() {
        return this.f15590d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15593g.intValue() - ((ub) obj).f15593g.intValue();
    }

    public final cb d() {
        return this.f15596j;
    }

    public final ub e(cb cbVar) {
        this.f15596j = cbVar;
        return this;
    }

    public final ub g(xb xbVar) {
        this.f15594h = xbVar;
        return this;
    }

    public final ub h(int i8) {
        this.f15593g = Integer.valueOf(i8);
        return this;
    }

    protected abstract ac i(qb qbVar);

    public final int j() {
        return this.f15588b;
    }

    public final String o() {
        int i8 = this.f15588b;
        String str = this.f15589c;
        if (i8 == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String q() {
        return this.f15589c;
    }

    public Map r() {
        return Collections.emptyMap();
    }

    public final void s(String str) {
        if (fc.f7715c) {
            this.f15587a.a(str, Thread.currentThread().getId());
        }
    }

    public final void t(dc dcVar) {
        yb ybVar;
        synchronized (this.f15591e) {
            ybVar = this.f15592f;
        }
        ybVar.a(dcVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f15590d));
        C();
        return "[ ] " + this.f15589c + " " + "0x".concat(strValueOf) + " NORMAL " + this.f15593g;
    }

    protected abstract void u(Object obj);

    final void v(String str) {
        xb xbVar = this.f15594h;
        if (xbVar != null) {
            xbVar.b(this);
        }
        if (fc.f7715c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new sb(this, str, id));
            } else {
                this.f15587a.a(str, id);
                this.f15587a.b(toString());
            }
        }
    }

    public final void w() {
        synchronized (this.f15591e) {
            this.f15595i = true;
        }
    }

    final void x() {
        tb tbVar;
        synchronized (this.f15591e) {
            tbVar = this.f15597k;
        }
        if (tbVar != null) {
            tbVar.a(this);
        }
    }

    final void y(ac acVar) {
        tb tbVar;
        synchronized (this.f15591e) {
            tbVar = this.f15597k;
        }
        if (tbVar != null) {
            tbVar.b(this, acVar);
        }
    }

    final void z(int i8) {
        xb xbVar = this.f15594h;
        if (xbVar != null) {
            xbVar.c(this, i8);
        }
    }
}
