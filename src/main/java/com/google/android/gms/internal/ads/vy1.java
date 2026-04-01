package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class vy1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f16525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f16526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f16527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f16528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f16529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f16530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f16531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f16532h;

    public vy1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6, w84 w84Var7, w84 w84Var8) {
        this.f16525a = w84Var;
        this.f16526b = w84Var2;
        this.f16527c = w84Var3;
        this.f16528d = w84Var4;
        this.f16529e = w84Var5;
        this.f16530f = w84Var6;
        this.f16531g = w84Var7;
        this.f16532h = w84Var8;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* synthetic */ Object k() {
        Context contextA = ((io0) this.f16525a).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new uy1(contextA, lg3Var, new kb0(), ((ro0) this.f16528d).k(), ((oz1) this.f16529e).k(), (ArrayDeque) this.f16530f.k(), new kz1(), (ty2) this.f16532h.k());
    }
}
