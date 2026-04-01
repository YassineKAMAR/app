package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
final class i12 extends e22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f9040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i2.s f9041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9043d;

    /* synthetic */ i12(Activity activity, i2.s sVar, String str, String str2, h12 h12Var) {
        this.f9040a = activity;
        this.f9041b = sVar;
        this.f9042c = str;
        this.f9043d = str2;
    }

    @Override // com.google.android.gms.internal.ads.e22
    public final Activity a() {
        return this.f9040a;
    }

    @Override // com.google.android.gms.internal.ads.e22
    public final i2.s b() {
        return this.f9041b;
    }

    @Override // com.google.android.gms.internal.ads.e22
    public final String c() {
        return this.f9042c;
    }

    @Override // com.google.android.gms.internal.ads.e22
    public final String d() {
        return this.f9043d;
    }

    public final boolean equals(Object obj) {
        i2.s sVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e22) {
            e22 e22Var = (e22) obj;
            if (this.f9040a.equals(e22Var.a()) && ((sVar = this.f9041b) != null ? sVar.equals(e22Var.b()) : e22Var.b() == null) && ((str = this.f9042c) != null ? str.equals(e22Var.c()) : e22Var.c() == null)) {
                String str2 = this.f9043d;
                String strD = e22Var.d();
                if (str2 != null ? str2.equals(strD) : strD == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9040a.hashCode() ^ 1000003;
        i2.s sVar = this.f9041b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (sVar == null ? 0 : sVar.hashCode())) * 1000003;
        String str = this.f9042c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9043d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        i2.s sVar = this.f9041b;
        return "OfflineUtilsParams{activity=" + this.f9040a.toString() + ", adOverlay=" + String.valueOf(sVar) + ", gwsQueryId=" + this.f9042c + ", uri=" + this.f9043d + "}";
    }
}
