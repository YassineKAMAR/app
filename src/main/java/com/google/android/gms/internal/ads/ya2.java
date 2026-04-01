package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ya2 implements t61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f17721a = new AtomicReference();

    public final void a(h2.f2 f2Var) {
        this.f17721a.set(f2Var);
    }

    @Override // com.google.android.gms.internal.ads.t61
    public final void b(final h2.y4 y4Var) {
        wo2.a(this.f17721a, new vo2() { // from class: com.google.android.gms.internal.ads.xa2
            @Override // com.google.android.gms.internal.ads.vo2
            public final void a(Object obj) {
                ((h2.f2) obj).p4(y4Var);
            }
        });
    }
}
