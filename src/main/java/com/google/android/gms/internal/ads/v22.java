package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.b;

/* JADX INFO: loaded from: classes.dex */
public final class v22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15971a;

    v22(Context context) {
        this.f15971a = context;
    }

    public final x3.d a(boolean z7) {
        androidx.privacysandbox.ads.adservices.topics.b bVarA = new b.a().b("com.google.android.gms.ads").c(z7).a();
        k0.a aVarA = k0.a.a(this.f15971a);
        return aVarA != null ? aVarA.b(bVarA) : zf3.g(new IllegalStateException());
    }
}
