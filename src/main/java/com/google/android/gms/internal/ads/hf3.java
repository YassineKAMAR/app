package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class hf3 extends jf3 {
    hf3(eb3 eb3Var, boolean z7) {
        super(eb3Var, z7);
        R();
    }

    @Override // com.google.android.gms.internal.ads.jf3
    public final /* bridge */ /* synthetic */ Object V(List list) {
        ArrayList arrayListA = yb3.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if3 if3Var = (if3) it.next();
            arrayListA.add(if3Var != null ? if3Var.f9175a : null);
        }
        return Collections.unmodifiableList(arrayListA);
    }
}
