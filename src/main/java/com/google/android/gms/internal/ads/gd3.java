package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class gd3 {
    static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set b(Set set, m83 m83Var) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof dd3)) {
                set.getClass();
                return new dd3(set, m83Var);
            }
            dd3 dd3Var = (dd3) set;
            return new dd3(dd3Var.f8277a, q83.a(dd3Var.f8278b, m83Var));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof dd3)) {
            sortedSet.getClass();
            return new ed3(sortedSet, m83Var);
        }
        dd3 dd3Var2 = (dd3) sortedSet;
        return new ed3((SortedSet) dd3Var2.f8277a, q83.a(dd3Var2.f8278b, m83Var));
    }

    static boolean c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean d(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof pc3) {
            collection = ((pc3) collection).j();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return e(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    static boolean e(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
