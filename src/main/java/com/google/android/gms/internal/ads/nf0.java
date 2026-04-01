package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class nf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f11838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ jh0 f11839b;

    nf0(of0 of0Var, Context context, jh0 jh0Var) {
        this.f11838a = context;
        this.f11839b = jh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f11839b.d(d2.a.a(this.f11838a));
        } catch (IOException | IllegalStateException | x2.g e8) {
            this.f11839b.e(e8);
            qg0.e("Exception while getting advertising Id info", e8);
        }
    }
}
