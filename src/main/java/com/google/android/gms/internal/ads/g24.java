package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class g24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f24 f8170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f24 f8171b;

    static {
        f24 f24Var;
        try {
            f24Var = (f24) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f24Var = null;
        }
        f8170a = f24Var;
        f8171b = new f24();
    }

    static f24 a() {
        return f8170a;
    }

    static f24 b() {
        return f8171b;
    }
}
