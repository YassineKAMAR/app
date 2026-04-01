package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class uf3 extends sf3 implements x3.d {
    protected uf3() {
    }

    @Override // x3.d
    public final void c(Runnable runnable, Executor executor) {
        g().c(runnable, executor);
    }

    protected abstract x3.d g();
}
