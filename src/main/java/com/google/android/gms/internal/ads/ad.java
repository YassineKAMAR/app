package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class ad implements qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f5203a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f5204b;

    ad(Context context) {
        this.f5204b = context;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final File j() {
        if (this.f5203a == null) {
            this.f5203a = new File(this.f5204b.getCacheDir(), "volley");
        }
        return this.f5203a;
    }
}
