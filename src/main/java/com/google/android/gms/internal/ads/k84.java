package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class k84 implements j84, c84 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k84 f9986b = new k84(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9987a;

    private k84(Object obj) {
        this.f9987a = obj;
    }

    public static j84 a(Object obj) {
        r84.a(obj, "instance cannot be null");
        return new k84(obj);
    }

    public static j84 b(Object obj) {
        return obj == null ? f9986b : new k84(obj);
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final Object k() {
        return this.f9987a;
    }
}
