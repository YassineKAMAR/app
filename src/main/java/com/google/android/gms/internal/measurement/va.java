package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ta f19270a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ta f19271b = new wa();

    static ta a() {
        return f19270a;
    }

    static ta b() {
        return f19271b;
    }

    private static ta c() {
        try {
            return (ta) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
