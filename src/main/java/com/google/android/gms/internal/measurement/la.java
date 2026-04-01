package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ja f18928a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ja f18929b = new ia();

    static ja a() {
        return f18928a;
    }

    static ja b() {
        return f18929b;
    }

    private static ja c() {
        try {
            return (ja) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
