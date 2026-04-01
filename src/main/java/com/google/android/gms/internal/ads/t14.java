package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class t14 extends x14 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f14919c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ t14(s14 s14Var) {
        super(null);
    }

    private static List f(Object obj, long j8, int i8) {
        List list;
        List list2 = (List) g44.p(obj, j8);
        if (list2.isEmpty()) {
            List q14Var = list2 instanceof r14 ? new q14(i8) : ((list2 instanceof r24) && (list2 instanceof j14)) ? ((j14) list2).f(i8) : new ArrayList(i8);
            g44.D(obj, j8, q14Var);
            return q14Var;
        }
        if (f14919c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i8);
            arrayList.addAll(list2);
            list = arrayList;
        } else {
            if (!(list2 instanceof a44)) {
                if (!(list2 instanceof r24) || !(list2 instanceof j14)) {
                    return list2;
                }
                j14 j14Var = (j14) list2;
                if (j14Var.l()) {
                    return list2;
                }
                j14 j14VarF = j14Var.f(list2.size() + i8);
                g44.D(obj, j8, j14VarF);
                return j14VarF;
            }
            q14 q14Var2 = new q14(list2.size() + i8);
            q14Var2.addAll(q14Var2.size(), (a44) list2);
            list = q14Var2;
        }
        g44.D(obj, j8, list);
        return list;
    }

    @Override // com.google.android.gms.internal.ads.x14
    final List a(Object obj, long j8) {
        return f(obj, j8, 10);
    }

    @Override // com.google.android.gms.internal.ads.x14
    final void b(Object obj, long j8) {
        Object objUnmodifiableList;
        List list = (List) g44.p(obj, j8);
        if (list instanceof r14) {
            objUnmodifiableList = ((r14) list).m();
        } else {
            if (f14919c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof r24) && (list instanceof j14)) {
                j14 j14Var = (j14) list;
                if (j14Var.l()) {
                    j14Var.k();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        g44.D(obj, j8, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.x14
    final void c(Object obj, Object obj2, long j8) {
        List list = (List) g44.p(obj2, j8);
        List listF = f(obj, j8, list.size());
        int size = listF.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(list);
        }
        if (size > 0) {
            list = listF;
        }
        g44.D(obj, j8, list);
    }
}
