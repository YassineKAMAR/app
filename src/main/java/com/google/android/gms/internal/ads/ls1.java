package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ls1 implements lb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f11036a = new Bundle();

    @Override // com.google.android.gms.internal.ads.lb1
    public final void a(String str) {
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final synchronized void b(String str, String str2) {
        this.f11036a.putInt(str, 3);
    }

    public final synchronized Bundle c() {
        return new Bundle(this.f11036a);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final synchronized void e(String str) {
        this.f11036a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final synchronized void h(String str) {
        this.f11036a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void n() {
    }
}
