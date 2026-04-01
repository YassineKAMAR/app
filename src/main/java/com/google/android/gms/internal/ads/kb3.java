package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class kb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10011c;

    kb3(Object obj, Object obj2, Object obj3) {
        this.f10009a = obj;
        this.f10010b = obj2;
        this.f10011c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f10011c;
        Object obj2 = this.f10010b;
        Object obj3 = this.f10009a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f3943b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f3943b + String.valueOf(obj));
    }
}
