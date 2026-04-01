package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class sd2 implements oi2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f14614j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f14615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i11 f14618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bu2 f14619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ts2 f14620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j2.x1 f14621g = g2.t.q().h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zp1 f14622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v11 f14623i;

    public sd2(Context context, String str, String str2, i11 i11Var, bu2 bu2Var, ts2 ts2Var, zp1 zp1Var, v11 v11Var) {
        this.f14615a = context;
        this.f14616b = str;
        this.f14617c = str2;
        this.f14618d = i11Var;
        this.f14619e = bu2Var;
        this.f14620f = ts2Var;
        this.f14622h = zp1Var;
        this.f14623i = v11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void a(android.os.Bundle r4, android.os.Bundle r5) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sd2.a(android.os.Bundle, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        final Bundle bundle = new Bundle();
        if (((Boolean) h2.y.c().b(ns.v7)).booleanValue()) {
            zp1 zp1Var = this.f14622h;
            zp1Var.a().put("seq_num", this.f14616b);
        }
        if (((Boolean) h2.y.c().b(ns.f12230x5)).booleanValue()) {
            this.f14618d.e(this.f14620f.f15302d);
            bundle.putAll(this.f14619e.a());
        }
        return zf3.h(new ni2() { // from class: com.google.android.gms.internal.ads.rd2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                this.f14069a.a(bundle, (Bundle) obj);
            }
        });
    }
}
