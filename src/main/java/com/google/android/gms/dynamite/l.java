package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class l implements DynamiteModule.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4933a;

    public l(int i8, int i9) {
        this.f4933a = i8;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str, boolean z7) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str) {
        return this.f4933a;
    }
}
