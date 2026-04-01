package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9254a = new ArrayList();

    final hk0 a(dj0 dj0Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            hk0 hk0Var = (hk0) it.next();
            if (hk0Var.f8800c == dj0Var) {
                return hk0Var;
            }
        }
        return null;
    }

    public final void e(hk0 hk0Var) {
        this.f9254a.add(hk0Var);
    }

    public final void g(hk0 hk0Var) {
        this.f9254a.remove(hk0Var);
    }

    public final boolean i(dj0 dj0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            hk0 hk0Var = (hk0) it.next();
            if (hk0Var.f8800c == dj0Var) {
                arrayList.add(hk0Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((hk0) it2.next()).f8801d.h();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9254a.iterator();
    }
}
