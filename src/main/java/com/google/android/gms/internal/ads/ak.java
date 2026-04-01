package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ak implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f5292a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ii f5293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f5294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f5295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final ce f5296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Method f5297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final int f5298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int f5299h;

    public ak(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        this.f5293b = iiVar;
        this.f5294c = str;
        this.f5295d = str2;
        this.f5296e = ceVar;
        this.f5298g = i8;
        this.f5299h = i9;
    }

    protected abstract void a();

    public Void b() {
        int i8;
        try {
            long jNanoTime = System.nanoTime();
            Method methodJ = this.f5293b.j(this.f5294c, this.f5295d);
            this.f5297f = methodJ;
            if (methodJ == null) {
                return null;
            }
            a();
            bh bhVarD = this.f5293b.d();
            if (bhVarD != null && (i8 = this.f5298g) != Integer.MIN_VALUE) {
                bhVarD.c(this.f5299h, i8, (System.nanoTime() - jNanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
