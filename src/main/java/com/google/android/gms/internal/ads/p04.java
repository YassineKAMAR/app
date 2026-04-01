package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class p04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n04 f12693a = new o04();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n04 f12694b;

    static {
        n04 n04Var;
        try {
            n04Var = (n04) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n04Var = null;
        }
        f12694b = n04Var;
    }

    static n04 a() {
        n04 n04Var = f12694b;
        if (n04Var != null) {
            return n04Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static n04 b() {
        return f12693a;
    }
}
