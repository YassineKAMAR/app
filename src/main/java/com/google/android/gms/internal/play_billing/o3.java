package com.google.android.gms.internal.play_billing;

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
class o3 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19643a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile m3 f19647e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f19644b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f19645c = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f19648f = Collections.emptyMap();

    private final int l(Comparable comparable) {
        int size = this.f19644b.size() - 1;
        int i8 = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((i3) this.f19644b.get(size)).a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i8 <= size) {
            int i9 = (i8 + size) / 2;
            int iCompareTo2 = comparable.compareTo(((i3) this.f19644b.get(i9)).a());
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
        Object value = ((i3) this.f19644b.remove(i8)).getValue();
        if (!this.f19645c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.f19644b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new i3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f19645c.isEmpty() && !(this.f19645c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19645c = treeMap;
            this.f19648f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19645c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f19646d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f19646d) {
            return;
        }
        this.f19645c = this.f19645c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f19645c);
        this.f19648f = this.f19648f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f19648f);
        this.f19646d = true;
    }

    public final int b() {
        return this.f19644b.size();
    }

    public final Iterable c() {
        return this.f19645c.isEmpty() ? h3.a() : this.f19645c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f19644b.isEmpty()) {
            this.f19644b.clear();
        }
        if (this.f19645c.isEmpty()) {
            return;
        }
        this.f19645c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f19645c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19647e == null) {
            this.f19647e = new m3(this, null);
        }
        return this.f19647e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return super.equals(obj);
        }
        o3 o3Var = (o3) obj;
        int size = size();
        if (size != o3Var.size()) {
            return false;
        }
        int iB = b();
        if (iB == o3Var.b()) {
            for (int i8 = 0; i8 < iB; i8++) {
                if (!h(i8).equals(o3Var.h(i8))) {
                    return false;
                }
            }
            if (iB == size) {
                return true;
            }
            objEntrySet = this.f19645c;
            objEntrySet2 = o3Var.f19645c;
        } else {
            objEntrySet = entrySet();
            objEntrySet2 = o3Var.entrySet();
        }
        return objEntrySet.equals(objEntrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((i3) this.f19644b.get(iL)).setValue(obj);
        }
        o();
        if (this.f19644b.isEmpty() && !(this.f19644b instanceof ArrayList)) {
            this.f19644b = new ArrayList(this.f19643a);
        }
        int i8 = -(iL + 1);
        if (i8 >= this.f19643a) {
            return n().put(comparable, obj);
        }
        int size = this.f19644b.size();
        int i9 = this.f19643a;
        if (size == i9) {
            i3 i3Var = (i3) this.f19644b.remove(i9 - 1);
            n().put(i3Var.a(), i3Var.getValue());
        }
        this.f19644b.add(i8, new i3(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((i3) this.f19644b.get(iL)).getValue() : this.f19645c.get(comparable);
    }

    public final Map.Entry h(int i8) {
        return (Map.Entry) this.f19644b.get(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i8 = 0; i8 < iB; i8++) {
            iHashCode += ((i3) this.f19644b.get(i8)).hashCode();
        }
        return this.f19645c.size() > 0 ? iHashCode + this.f19645c.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f19646d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f19645c.isEmpty()) {
            return null;
        }
        return this.f19645c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19644b.size() + this.f19645c.size();
    }
}
