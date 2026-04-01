package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b1 f19483a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b1 f19484b;

    static {
        b1 b1Var;
        try {
            b1Var = (b1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            b1Var = null;
        }
        f19484b = b1Var;
    }

    static b1 a() {
        b1 b1Var = f19484b;
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static b1 b() {
        return f19483a;
    }
}
