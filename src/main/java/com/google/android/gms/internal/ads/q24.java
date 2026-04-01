package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class q24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p24 f13253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p24 f13254b;

    static {
        p24 p24Var;
        try {
            p24Var = (p24) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            p24Var = null;
        }
        f13253a = p24Var;
        f13254b = new p24();
    }

    static p24 a() {
        return f13253a;
    }

    static p24 b() {
        return f13254b;
    }
}
