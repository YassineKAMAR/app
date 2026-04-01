package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: loaded from: classes.dex */
final class z8 implements na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z8 f19434a = new z8();

    private z8() {
    }

    public static z8 c() {
        return f19434a;
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final ka a(Class<?> cls) {
        if (!y8.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (ka) y8.n(cls.asSubclass(y8.class)).q(y8.e.f19407c, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final boolean b(Class<?> cls) {
        return y8.class.isAssignableFrom(cls);
    }
}
