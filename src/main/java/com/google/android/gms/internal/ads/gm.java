package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class gm implements Comparator {
    public gm(hm hmVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ul ulVar = (ul) obj;
        ul ulVar2 = (ul) obj2;
        if (ulVar.d() >= ulVar2.d()) {
            if (ulVar.d() > ulVar2.d()) {
                return 1;
            }
            if (ulVar.b() >= ulVar2.b()) {
                if (ulVar.b() > ulVar2.b()) {
                    return 1;
                }
                float fA = (ulVar.a() - ulVar.d()) * (ulVar.c() - ulVar.b());
                float fA2 = (ulVar2.a() - ulVar2.d()) * (ulVar2.c() - ulVar2.b());
                if (fA <= fA2) {
                    return fA < fA2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
