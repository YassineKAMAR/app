package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class j1 implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j1 f19584a = new j1();

    private j1() {
    }

    public static j1 a() {
        return f19584a;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final n2 b(Class cls) {
        if (!n1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (n2) n1.f(cls.asSubclass(n1.class)).u(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final boolean c(Class cls) {
        return n1.class.isAssignableFrom(cls);
    }
}
