package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ai2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f5281e;

    public ai2(String str, String str2, String str3, String str4, Long l8) {
        this.f5277a = str;
        this.f5278b = str2;
        this.f5279c = str3;
        this.f5280d = str4;
        this.f5281e = l8;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        ft2.c(bundle, "gmp_app_id", this.f5277a);
        ft2.c(bundle, "fbs_aiid", this.f5278b);
        ft2.c(bundle, "fbs_aeid", this.f5279c);
        ft2.c(bundle, "apm_id_origin", this.f5280d);
        Long l8 = this.f5281e;
        if (l8 != null) {
            bundle.putLong("sai_timeout", l8.longValue());
        }
    }
}
