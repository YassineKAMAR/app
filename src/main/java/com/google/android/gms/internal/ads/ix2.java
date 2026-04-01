package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ix2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f9399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vg0 f9400b;

    public ix2(Executor executor, vg0 vg0Var) {
        this.f9399a = executor;
        this.f9400b = vg0Var;
    }

    final /* synthetic */ void a(String str) {
        this.f9400b.a(str);
    }

    public final void b(final String str) {
        this.f9399a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hx2
            @Override // java.lang.Runnable
            public final void run() {
                this.f9012a.a(str);
            }
        });
    }
}
