package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class dc3 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f6681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f6682b;

    dc3() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f6681a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f6681a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f6682b;
        if (collection != null) {
            return collection;
        }
        cc3 cc3Var = new cc3(this);
        this.f6682b = cc3Var;
        return cc3Var;
    }
}
