package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ze1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f18180a;

    public ze1(w84 w84Var) {
        this.f18180a = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Set setSingleton = ((we1) this.f18180a).a().e() != null ? Collections.singleton("banner") : Collections.emptySet();
        r84.b(setSingleton);
        return setSingleton;
    }
}
