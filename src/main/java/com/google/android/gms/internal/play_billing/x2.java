package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w2 f19737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w2 f19738b;

    static {
        w2 w2Var;
        try {
            w2Var = (w2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w2Var = null;
        }
        f19737a = w2Var;
        f19738b = new w2();
    }

    static w2 a() {
        return f19737a;
    }

    static w2 b() {
        return f19738b;
    }
}
