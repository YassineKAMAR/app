package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ia implements ja {
    ia() {
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final ha<?, ?> a(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final Object b(Object obj) {
        return ga.h().k();
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final boolean c(Object obj) {
        return !((ga) obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final Map<?, ?> d(Object obj) {
        return (ga) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final Map<?, ?> e(Object obj) {
        return (ga) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final Object f(Object obj) {
        ((ga) obj).l();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final Object g(Object obj, Object obj2) {
        ga gaVarK = (ga) obj;
        ga gaVar = (ga) obj2;
        if (!gaVar.isEmpty()) {
            if (!gaVarK.n()) {
                gaVarK = gaVarK.k();
            }
            gaVarK.i(gaVar);
        }
        return gaVarK;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final int h(int i8, Object obj, Object obj2) {
        ga gaVar = (ga) obj;
        if (gaVar.isEmpty()) {
            return 0;
        }
        Iterator it = gaVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
