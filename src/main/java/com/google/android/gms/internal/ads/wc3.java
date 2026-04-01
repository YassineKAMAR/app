package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class wc3 extends ob3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient mb3 f16687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f16688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f16689e;

    wc3(mb3 mb3Var, Object[] objArr, int i8, int i9) {
        this.f16687c = mb3Var;
        this.f16688d = objArr;
        this.f16689e = i9;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int a(Object[] objArr, int i8) {
        return i().a(objArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f16687c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3
    /* JADX INFO: renamed from: n */
    public final kd3 iterator() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16689e;
    }

    @Override // com.google.android.gms.internal.ads.ob3
    final jb3 w() {
        return new vc3(this);
    }
}
