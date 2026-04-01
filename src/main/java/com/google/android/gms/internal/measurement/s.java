package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f19143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<r> f19144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b7 f19145e;

    private s(s sVar) {
        super(sVar.f18934a);
        ArrayList arrayList = new ArrayList(sVar.f19143c.size());
        this.f19143c = arrayList;
        arrayList.addAll(sVar.f19143c);
        ArrayList arrayList2 = new ArrayList(sVar.f19144d.size());
        this.f19144d = arrayList2;
        arrayList2.addAll(sVar.f19144d);
        this.f19145e = sVar.f19145e;
    }

    public s(String str, List<r> list, List<r> list2, b7 b7Var) {
        super(str);
        this.f19143c = new ArrayList();
        this.f19145e = b7Var;
        if (!list.isEmpty()) {
            Iterator<r> it = list.iterator();
            while (it.hasNext()) {
                this.f19143c.add(it.next().n());
            }
        }
        this.f19144d = new ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        String str;
        r rVarB;
        b7 b7VarD = this.f19145e.d();
        for (int i8 = 0; i8 < this.f19143c.size(); i8++) {
            if (i8 < list.size()) {
                str = this.f19143c.get(i8);
                rVarB = b7Var.b(list.get(i8));
            } else {
                str = this.f19143c.get(i8);
                rVarB = r.L;
            }
            b7VarD.e(str, rVarB);
        }
        for (r rVar : this.f19144d) {
            r rVarB2 = b7VarD.b(rVar);
            if (rVarB2 instanceof u) {
                rVarB2 = b7VarD.b(rVar);
            }
            if (rVarB2 instanceof k) {
                return ((k) rVarB2).a();
            }
        }
        return r.L;
    }

    @Override // com.google.android.gms.internal.measurement.m, com.google.android.gms.internal.measurement.r
    public final r l() {
        return new s(this);
    }
}
