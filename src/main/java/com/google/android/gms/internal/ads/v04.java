package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class v04 implements i24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v04 f15951a = new v04();

    private v04() {
    }

    public static v04 a() {
        return f15951a;
    }

    @Override // com.google.android.gms.internal.ads.i24
    public final h24 b(Class cls) {
        if (!z04.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (h24) z04.n(cls.asSubclass(z04.class)).J(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.i24
    public final boolean c(Class cls) {
        return z04.class.isAssignableFrom(cls);
    }
}
