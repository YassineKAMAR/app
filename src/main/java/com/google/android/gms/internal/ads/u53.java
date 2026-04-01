package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class u53 extends o63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f15495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f15498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15500f;

    /* synthetic */ u53(IBinder iBinder, boolean z7, String str, int i8, float f8, int i9, String str2, int i10, String str3, String str4, String str5, t53 t53Var) {
        this.f15495a = iBinder;
        this.f15496b = str;
        this.f15497c = i8;
        this.f15498d = f8;
        this.f15499e = i10;
        this.f15500f = str4;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final float a() {
        return this.f15498d;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final int c() {
        return this.f15497c;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final int d() {
        return this.f15499e;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final IBinder e() {
        return this.f15495a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o63) {
            o63 o63Var = (o63) obj;
            if (this.f15495a.equals(o63Var.e())) {
                o63Var.k();
                String str = this.f15496b;
                if (str != null ? str.equals(o63Var.g()) : o63Var.g() == null) {
                    if (this.f15497c == o63Var.c() && Float.floatToIntBits(this.f15498d) == Float.floatToIntBits(o63Var.a())) {
                        o63Var.b();
                        o63Var.i();
                        if (this.f15499e == o63Var.d()) {
                            o63Var.h();
                            String str2 = this.f15500f;
                            if (str2 != null ? str2.equals(o63Var.f()) : o63Var.f() == null) {
                                o63Var.j();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final String f() {
        return this.f15500f;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final String g() {
        return this.f15496b;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final String h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f15495a.hashCode() ^ 1000003;
        String str = this.f15496b;
        int iHashCode2 = (((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f15497c) * 1000003) ^ Float.floatToIntBits(this.f15498d);
        int i8 = this.f15499e;
        String str2 = this.f15500f;
        return ((((iHashCode2 * 583896283) ^ i8) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final String j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o63
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f15495a.toString() + ", stableSessionToken=false, appId=" + this.f15496b + ", layoutGravity=" + this.f15497c + ", layoutVerticalMargin=" + this.f15498d + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.f15499e + ", deeplinkUrl=null, adFieldEnifd=" + this.f15500f + ", thirdPartyAuthCallerId=null}";
    }
}
