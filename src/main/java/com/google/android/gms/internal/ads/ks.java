package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ks implements zu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ls f10259a;

    ks(ls lsVar) {
        this.f10259a = lsVar;
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final String a(String str, String str2) {
        return this.f10259a.f11031e.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final Double b(String str, double d8) {
        try {
            return Double.valueOf(this.f10259a.f11031e.getFloat(str, (float) d8));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f10259a.f11031e.getString(str, String.valueOf(d8)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final Long c(String str, long j8) {
        try {
            return Long.valueOf(this.f10259a.f11031e.getLong(str, j8));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f10259a.f11031e.getInt(str, (int) j8));
        }
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final Boolean d(String str, boolean z7) {
        try {
            return Boolean.valueOf(this.f10259a.f11031e.getBoolean(str, z7));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f10259a.f11031e.getString(str, String.valueOf(z7)));
        }
    }
}
