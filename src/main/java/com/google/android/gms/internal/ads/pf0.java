package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class pf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f12845a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12846b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ qf0 f12847c;

    public pf0(qf0 qf0Var) {
        this.f12847c = qf0Var;
    }

    public final long a() {
        return this.f12846b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f12845a);
        bundle.putLong("tclose", this.f12846b);
        return bundle;
    }

    public final void c() {
        this.f12846b = this.f12847c.f13431a.b();
    }

    public final void d() {
        this.f12845a = this.f12847c.f13431a.b();
    }
}
