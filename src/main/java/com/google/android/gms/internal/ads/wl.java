package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class wl implements Comparator {
    wl(zl zlVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        dm dmVar = (dm) obj;
        dm dmVar2 = (dm) obj2;
        int i8 = dmVar.f6806c - dmVar2.f6806c;
        return i8 != 0 ? i8 : (dmVar.f6804a > dmVar2.f6804a ? 1 : (dmVar.f6804a == dmVar2.f6804a ? 0 : -1));
    }
}
