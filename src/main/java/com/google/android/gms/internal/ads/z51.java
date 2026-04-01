package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z51 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f18030a;

    public z51(w84 w84Var) {
        this.f18030a = w84Var;
    }

    public static y51 b(Set set) {
        return new y51(set);
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y51 k() {
        return new y51(((u84) this.f18030a).k());
    }
}
