package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class j implements DynamiteModule.b {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0075b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0075b c0075b = new DynamiteModule.b.C0075b();
        int iB = aVar.b(context, str);
        c0075b.f4929a = iB;
        int i8 = 0;
        int iA = iB != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0075b.f4930b = iA;
        int i9 = c0075b.f4929a;
        if (i9 == 0) {
            if (iA == 0) {
                c0075b.f4931c = 0;
            }
            return c0075b;
        }
        i8 = i9;
        if (iA >= i8) {
            c0075b.f4931c = 1;
        } else {
            c0075b.f4931c = -1;
        }
        return c0075b;
    }
}
