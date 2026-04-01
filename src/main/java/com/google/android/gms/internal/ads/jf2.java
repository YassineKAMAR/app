package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class jf2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9596b;

    public jf2(String str, boolean z7) {
        this.f9595a = str;
        this.f9596b = z7;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f9595a);
        if (this.f9596b) {
            bundle.putString("de", "1");
        }
    }
}
