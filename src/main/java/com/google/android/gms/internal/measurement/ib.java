package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
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
class ib<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<pb> f18801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f18802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile ub f18804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f18805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile mb f18806g;

    private ib(int i8) {
        this.f18800a = i8;
        this.f18801b = Collections.emptyList();
        this.f18802c = Collections.emptyMap();
        this.f18805f = Collections.emptyMap();
    }

    private final int a(K k8) {
        int size = this.f18801b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k8.compareTo((Comparable) this.f18801b.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) / 2;
            int iCompareTo2 = k8.compareTo((Comparable) this.f18801b.get(i9).getKey());
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

    static <FieldDescriptorType extends t8<FieldDescriptorType>> ib<FieldDescriptorType, Object> b(int i8) {
        return new hb(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V l(int i8) {
        r();
        V v7 = (V) this.f18801b.remove(i8).getValue();
        if (!this.f18802c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.f18801b.add(new pb(this, it.next()));
            it.remove();
        }
        return v7;
    }

    private final SortedMap<K, V> q() {
        r();
        if (this.f18802c.isEmpty() && !(this.f18802c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18802c = treeMap;
            this.f18805f = treeMap.descendingMap();
        }
        return (SortedMap) this.f18802c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        if (this.f18803d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        r();
        if (!this.f18801b.isEmpty()) {
            this.f18801b.clear();
        }
        if (this.f18802c.isEmpty()) {
            return;
        }
        this.f18802c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f18802c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k8, V v7) {
        r();
        int iA = a(k8);
        if (iA >= 0) {
            return (V) this.f18801b.get(iA).setValue(v7);
        }
        r();
        if (this.f18801b.isEmpty() && !(this.f18801b instanceof ArrayList)) {
            this.f18801b = new ArrayList(this.f18800a);
        }
        int i8 = -(iA + 1);
        if (i8 >= this.f18800a) {
            return q().put(k8, v7);
        }
        int size = this.f18801b.size();
        int i9 = this.f18800a;
        if (size == i9) {
            pb pbVarRemove = this.f18801b.remove(i9 - 1);
            q().put((Comparable) pbVarRemove.getKey(), pbVarRemove.getValue());
        }
        this.f18801b.add(i8, new pb(this, k8, v7));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f18804e == null) {
            this.f18804e = new ub(this);
        }
        return this.f18804e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return super.equals(obj);
        }
        ib ibVar = (ib) obj;
        int size = size();
        if (size != ibVar.size()) {
            return false;
        }
        int iH = h();
        if (iH != ibVar.h()) {
            objEntrySet = entrySet();
            objEntrySet2 = ibVar.entrySet();
        } else {
            for (int i8 = 0; i8 < iH; i8++) {
                if (!i(i8).equals(ibVar.i(i8))) {
                    return false;
                }
            }
            if (iH == size) {
                return true;
            }
            objEntrySet = this.f18802c;
            objEntrySet2 = ibVar.f18802c;
        }
        return objEntrySet.equals(objEntrySet2);
    }

    public void g() {
        if (this.f18803d) {
            return;
        }
        this.f18802c = this.f18802c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18802c);
        this.f18805f = this.f18805f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18805f);
        this.f18803d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? (V) this.f18801b.get(iA).getValue() : this.f18802c.get(comparable);
    }

    public final int h() {
        return this.f18801b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iH = h();
        int iHashCode = 0;
        for (int i8 = 0; i8 < iH; i8++) {
            iHashCode += this.f18801b.get(i8).hashCode();
        }
        return this.f18802c.size() > 0 ? iHashCode + this.f18802c.hashCode() : iHashCode;
    }

    public final Map.Entry<K, V> i(int i8) {
        return this.f18801b.get(i8);
    }

    public final Iterable<Map.Entry<K, V>> k() {
        return this.f18802c.isEmpty() ? ob.a() : this.f18802c.entrySet();
    }

    final Set<Map.Entry<K, V>> n() {
        if (this.f18806g == null) {
            this.f18806g = new mb(this);
        }
        return this.f18806g;
    }

    public final boolean p() {
        return this.f18803d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return l(iA);
        }
        if (this.f18802c.isEmpty()) {
            return null;
        }
        return this.f18802c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f18801b.size() + this.f18802c.size();
    }
}
