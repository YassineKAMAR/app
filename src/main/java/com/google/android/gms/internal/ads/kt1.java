package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class kt1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f10346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f10347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f10348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f10349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f10350e;

    public kt1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f10346a = w84Var;
        this.f10347b = w84Var2;
        this.f10348c = w84Var3;
        this.f10349d = w84Var4;
        this.f10350e = w84Var5;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f10346a).a();
        WeakReference weakReferenceA = ((jo0) this.f10347b).a();
        nt1 nt1Var = (nt1) this.f10348c.k();
        bu1 bu1Var = new bu1();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new au1(contextA, weakReferenceA, nt1Var, bu1Var, lg3Var);
    }
}
