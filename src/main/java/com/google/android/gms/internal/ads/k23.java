package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class k23 extends h23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f9911d;

    k23() {
    }

    @Override // com.google.android.gms.internal.ads.h23
    public final h23 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f9908a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.h23
    public final h23 b(boolean z7) {
        this.f9910c = true;
        this.f9911d = (byte) (this.f9911d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.h23
    public final h23 c(boolean z7) {
        this.f9909b = z7;
        this.f9911d = (byte) (this.f9911d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.h23
    public final i23 d() {
        String str;
        if (this.f9911d == 3 && (str = this.f9908a) != null) {
            return new m23(str, this.f9909b, this.f9910c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9908a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f9911d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f9911d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
