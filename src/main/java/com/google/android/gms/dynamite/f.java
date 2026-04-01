package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0075b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0075b c0075b = new DynamiteModule.b.C0075b();
        int iA = aVar.a(context, str, false);
        c0075b.f4930b = iA;
        if (iA == 0) {
            c0075b.f4931c = 0;
        } else {
            c0075b.f4931c = 1;
        }
        return c0075b;
    }
}
