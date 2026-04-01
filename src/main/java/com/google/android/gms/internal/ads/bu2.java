package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class bu2 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f6045a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg0 f6047c;

    public bu2(Context context, dg0 dg0Var) {
        this.f6046b = context;
        this.f6047c = dg0Var;
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final synchronized void A(h2.z2 z2Var) {
        if (z2Var.f22383a != 3) {
            this.f6047c.l(this.f6045a);
        }
    }

    public final Bundle a() {
        return this.f6047c.n(this.f6046b, this);
    }

    public final synchronized void b(HashSet hashSet) {
        this.f6045a.clear();
        this.f6045a.addAll(hashSet);
    }
}
