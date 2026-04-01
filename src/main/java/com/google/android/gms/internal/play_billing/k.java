package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends d implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient g f19605b;

    k() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return s.a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public g i() {
        g gVar = this.f19605b;
        if (gVar != null) {
            return gVar;
        }
        g gVarV = v();
        this.f19605b = gVarV;
        return gVarV;
    }

    g v() {
        Object[] array = toArray();
        int i8 = g.f19514c;
        return g.w(array, array.length);
    }
}
