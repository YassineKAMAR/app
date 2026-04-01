package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class t9 extends u9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f19224c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private t9() {
        super();
    }

    private static <L> List<L> e(Object obj, long j8, int i8) {
        List<L> listB;
        Object obj2;
        List<L> listF = f(obj, j8);
        if (!listF.isEmpty()) {
            if (f19224c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i8);
                arrayList.addAll(listF);
                obj2 = arrayList;
            } else if (listF instanceof ec) {
                s9 s9Var = new s9(listF.size() + i8);
                s9Var.addAll((ec) listF);
                obj2 = s9Var;
            } else {
                if (!(listF instanceof xa) || !(listF instanceof h9)) {
                    return listF;
                }
                h9 h9Var = (h9) listF;
                if (h9Var.l()) {
                    return listF;
                }
                listB = h9Var.b(listF.size() + i8);
            }
            jc.j(obj, j8, obj2);
            return (List<L>) obj2;
        }
        listB = listF instanceof r9 ? new s9(i8) : ((listF instanceof xa) && (listF instanceof h9)) ? ((h9) listF).b(i8) : new ArrayList<>(i8);
        jc.j(obj, j8, listB);
        return listB;
    }

    private static <E> List<E> f(Object obj, long j8) {
        return (List) jc.B(obj, j8);
    }

    @Override // com.google.android.gms.internal.measurement.u9
    final <E> void b(Object obj, Object obj2, long j8) {
        List listF = f(obj2, j8);
        List listE = e(obj, j8, listF.size());
        int size = listE.size();
        int size2 = listF.size();
        if (size > 0 && size2 > 0) {
            listE.addAll(listF);
        }
        if (size > 0) {
            listF = listE;
        }
        jc.j(obj, j8, listF);
    }

    @Override // com.google.android.gms.internal.measurement.u9
    final void d(Object obj, long j8) {
        Object objUnmodifiableList;
        List list = (List) jc.B(obj, j8);
        if (list instanceof r9) {
            objUnmodifiableList = ((r9) list).q();
        } else {
            if (f19224c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof xa) && (list instanceof h9)) {
                h9 h9Var = (h9) list;
                if (h9Var.l()) {
                    h9Var.t();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        jc.j(obj, j8, objUnmodifiableList);
    }
}
