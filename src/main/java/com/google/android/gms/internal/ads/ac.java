package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cb f5191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dc f5192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5193d;

    private ac(dc dcVar) {
        this.f5193d = false;
        this.f5190a = null;
        this.f5191b = null;
        this.f5192c = dcVar;
    }

    private ac(Object obj, cb cbVar) {
        this.f5193d = false;
        this.f5190a = obj;
        this.f5191b = cbVar;
        this.f5192c = null;
    }

    public static ac a(dc dcVar) {
        return new ac(dcVar);
    }

    public static ac b(Object obj, cb cbVar) {
        return new ac(obj, cbVar);
    }

    public final boolean c() {
        return this.f5192c == null;
    }
}
