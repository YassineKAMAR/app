package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f8191a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8192b;

    public final g4 a(int i8) {
        uu1.f(!this.f8192b);
        this.f8191a.append(i8, true);
        return this;
    }

    public final i6 b() {
        uu1.f(!this.f8192b);
        this.f8192b = true;
        return new i6(this.f8191a, null);
    }
}
