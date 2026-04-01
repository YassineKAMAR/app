package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class ea3 implements fc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f7226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f7227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f7228c;

    ea3() {
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final Collection B() {
        Collection collection = this.f7227b;
        if (collection != null) {
            return collection;
        }
        Collection collectionB = b();
        this.f7227b = collectionB;
        return collectionB;
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final Map C() {
        Map map = this.f7228c;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f7228c = mapD;
        return mapD;
    }

    abstract Collection b();

    abstract Iterator c();

    abstract Map d();

    abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fc3) {
            return C().equals(((fc3) obj).C());
        }
        return false;
    }

    public final Set f() {
        Set set = this.f7226a;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.f7226a = setE;
        return setE;
    }

    public final int hashCode() {
        return C().hashCode();
    }

    public final String toString() {
        return C().toString();
    }
}
