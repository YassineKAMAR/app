package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class vb2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16100a;

    public vb2(boolean z7) {
        this.f16100a = z7;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f16100a ? "0" : "1");
    }
}
