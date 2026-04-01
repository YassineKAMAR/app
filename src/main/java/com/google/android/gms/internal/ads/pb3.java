package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class pb3 {
    public static boolean a(Iterable iterable, m83 m83Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            m83Var.getClass();
            return c((List) iterable, m83Var);
        }
        Iterator it = iterable.iterator();
        m83Var.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            if (m83Var.a(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    private static void b(List list, m83 m83Var, int i8, int i9) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i9) {
                break;
            } else if (m83Var.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i9--;
            if (i9 < i8) {
                return;
            } else {
                list.remove(i9);
            }
        }
    }

    private static boolean c(List list, m83 m83Var) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < list.size()) {
            Object obj = list.get(i8);
            if (!m83Var.a(obj)) {
                if (i8 > i9) {
                    try {
                        list.set(i9, obj);
                    } catch (IllegalArgumentException unused) {
                        b(list, m83Var, i9, i8);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        b(list, m83Var, i9, i8);
                        return true;
                    }
                }
                i9++;
            }
            i8++;
        }
        list.subList(i9, list.size()).clear();
        return i8 != i9;
    }
}
