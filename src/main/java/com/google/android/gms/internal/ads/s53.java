package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class s53 extends m63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder f14526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f14529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f14531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f14532g;

    s53() {
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 a(String str) {
        this.f14531f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 b(String str) {
        this.f14527b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 c(int i8) {
        this.f14532g = (byte) (this.f14532g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 d(int i8) {
        this.f14528c = i8;
        this.f14532g = (byte) (this.f14532g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 e(float f8) {
        this.f14529d = f8;
        this.f14532g = (byte) (this.f14532g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 f(boolean z7) {
        this.f14532g = (byte) (this.f14532g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 g(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f14526a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final m63 h(int i8) {
        this.f14530e = i8;
        this.f14532g = (byte) (this.f14532g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.m63
    public final o63 i() {
        IBinder iBinder;
        if (this.f14532g == 31 && (iBinder = this.f14526a) != null) {
            return new u53(iBinder, false, this.f14527b, this.f14528c, this.f14529d, 0, null, this.f14530e, null, this.f14531f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14526a == null) {
            sb.append(" windowToken");
        }
        if ((this.f14532g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.f14532g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f14532g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f14532g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f14532g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
