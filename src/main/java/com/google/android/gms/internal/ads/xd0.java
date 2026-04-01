package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class xd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f17185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e3.e f17186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j2.x1 f17187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private se0 f17188d;

    /* synthetic */ xd0(wd0 wd0Var) {
    }

    public final xd0 a(j2.x1 x1Var) {
        this.f17187c = x1Var;
        return this;
    }

    public final xd0 b(Context context) {
        context.getClass();
        this.f17185a = context;
        return this;
    }

    public final xd0 c(e3.e eVar) {
        eVar.getClass();
        this.f17186b = eVar;
        return this;
    }

    public final xd0 d(se0 se0Var) {
        this.f17188d = se0Var;
        return this;
    }

    public final te0 e() {
        r84.c(this.f17185a, Context.class);
        r84.c(this.f17186b, e3.e.class);
        r84.c(this.f17187c, j2.x1.class);
        r84.c(this.f17188d, se0.class);
        return new zd0(this.f17185a, this.f17186b, this.f17187c, this.f17188d, null);
    }
}
