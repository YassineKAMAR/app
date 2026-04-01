package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2 f19629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2 f19630b;

    static {
        l2 l2Var;
        try {
            l2Var = (l2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            l2Var = null;
        }
        f19629a = l2Var;
        f19630b = new l2();
    }

    static l2 a() {
        return f19629a;
    }

    static l2 b() {
        return f19630b;
    }
}
