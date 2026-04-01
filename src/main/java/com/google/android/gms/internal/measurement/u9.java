package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u9 f19255a = new t9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u9 f19256b = new v9();

    private u9() {
    }

    static u9 a() {
        return f19255a;
    }

    static u9 c() {
        return f19256b;
    }

    abstract <L> void b(Object obj, Object obj2, long j8);

    abstract void d(Object obj, long j8);
}
