package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n8<?> f19008a = new p8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n8<?> f19009b = c();

    static n8<?> a() {
        n8<?> n8Var = f19009b;
        if (n8Var != null) {
            return n8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static n8<?> b() {
        return f19008a;
    }

    private static n8<?> c() {
        try {
            return (n8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
