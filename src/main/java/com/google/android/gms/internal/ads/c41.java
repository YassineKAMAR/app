package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c41 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b41 f6148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f6149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f6150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f6151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f6152e;

    public c41(b41 b41Var, w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f6148a = b41Var;
        this.f6149b = w84Var;
        this.f6150c = w84Var2;
        this.f6151d = w84Var3;
        this.f6152e = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* synthetic */ Object k() {
        Context context = (Context) this.f6149b.k();
        wg0 wg0VarA = ((uo0) this.f6150c).a();
        wr2 wr2VarA = ((e01) this.f6151d).a();
        jd0 jd0Var = new jd0();
        kd0 kd0Var = wr2VarA.C;
        if (kd0Var == null) {
            return null;
        }
        cs2 cs2Var = wr2VarA.f16905u;
        return new id0(context, wg0VarA, kd0Var, cs2Var == null ? null : cs2Var.f6466b, jd0Var);
    }
}
