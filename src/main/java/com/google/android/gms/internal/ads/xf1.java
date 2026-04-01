package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xf1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f17205d;

    public xf1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f17202a = w84Var;
        this.f17203b = w84Var2;
        this.f17204c = w84Var3;
        this.f17205d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        pk pkVar = (pk) this.f17202a.k();
        Executor executor = (Executor) this.f17203b.k();
        Context context = (Context) this.f17204c.k();
        return new pw0(executor, new aw0(context, pkVar), (e3.e) this.f17205d.k());
    }
}
