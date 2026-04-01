package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19560c;

    h(Object obj, Object obj2, Object obj3) {
        this.f19558a = obj;
        this.f19559b = obj2;
        this.f19560c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f19560c;
        Object obj2 = this.f19559b;
        Object obj3 = this.f19558a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f3943b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f3943b + String.valueOf(obj));
    }
}
