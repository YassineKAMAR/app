package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class qi1 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ri1 f13516a;

    qi1(ri1 ri1Var) {
        this.f13516a = ri1Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        g2.t.q().u(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(List list) {
        try {
            fm0 fm0Var = (fm0) list.get(0);
            if (fm0Var != null) {
                this.f13516a.b(fm0Var);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e8) {
            g2.t.q().u(e8, "omid native display exp");
        }
    }
}
