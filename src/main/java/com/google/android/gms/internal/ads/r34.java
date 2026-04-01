package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class r34 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13887a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile p34 f13891e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f13888b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f13889c = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f13892f = Collections.emptyMap();

    private final int l(Comparable comparable) {
        int size = this.f13888b.size() - 1;
        int i8 = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((l34) this.f13888b.get(size)).a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i8 <= size) {
            int i9 = (i8 + size) / 2;
            int iCompareTo2 = comparable.compareTo(((l34) this.f13888b.get(i9)).a());
            if (iCompareTo2 < 0) {
                size = i9 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i9;
                }
                i8 = i9 + 1;
            }
        }
        return -(i8 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i8) {
        o();
        Object value = ((l34) this.f13888b.remove(i8)).getValue();
        if (!this.f13889c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.f13888b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new l34(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f13889c.isEmpty() && !(this.f13889c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13889c = treeMap;
            this.f13892f = treeMap.descendingMap();
        }
        return (SortedMap) this.f13889c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f13890d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f13890d) {
            return;
        }
        this.f13889c = this.f13889c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13889c);
        this.f13892f = this.f13892f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13892f);
        this.f13890d = true;
    }

    public final int b() {
        return this.f13888b.size();
    }

    public final Iterable c() {
        return this.f13889c.isEmpty() ? k34.a() : this.f13889c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f13888b.isEmpty()) {
            this.f13888b.clear();
        }
        if (this.f13889c.isEmpty()) {
            return;
        }
        this.f13889c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f13889c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f13891e == null) {
            this.f13891e = new p34(this, null);
        }
        return this.f13891e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r34)) {
            return super.equals(obj);
        }
        r34 r34Var = (r34) obj;
        int size = size();
        if (size != r34Var.size()) {
            return false;
        }
        int iB = b();
        if (iB == r34Var.b()) {
            for (int i8 = 0; i8 < iB; i8++) {
                if (!h(i8).equals(r34Var.h(i8))) {
                    return false;
                }
            }
            if (iB == size) {
                return true;
            }
            objEntrySet = this.f13889c;
            objEntrySet2 = r34Var.f13889c;
        } else {
            objEntrySet = entrySet();
            objEntrySet2 = r34Var.entrySet();
        }
        return objEntrySet.equals(objEntrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((l34) this.f13888b.get(iL)).setValue(obj);
        }
        o();
        if (this.f13888b.isEmpty() && !(this.f13888b instanceof ArrayList)) {
            this.f13888b = new ArrayList(this.f13887a);
        }
        int i8 = -(iL + 1);
        if (i8 >= this.f13887a) {
            return n().put(comparable, obj);
        }
        int size = this.f13888b.size();
        int i9 = this.f13887a;
        if (size == i9) {
            l34 l34Var = (l34) this.f13888b.remove(i9 - 1);
            n().put(l34Var.a(), l34Var.getValue());
        }
        this.f13888b.add(i8, new l34(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((l34) this.f13888b.get(iL)).getValue() : this.f13889c.get(comparable);
    }

    public final Map.Entry h(int i8) {
        return (Map.Entry) this.f13888b.get(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i8 = 0; i8 < iB; i8++) {
            iHashCode += ((l34) this.f13888b.get(i8)).hashCode();
        }
        return this.f13889c.size() > 0 ? iHashCode + this.f13889c.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f13890d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f13889c.isEmpty()) {
            return null;
        }
        return this.f13889c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13888b.size() + this.f13889c.size();
    }
}
