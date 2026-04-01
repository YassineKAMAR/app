package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l, r, Iterable<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SortedMap<Integer, r> f18709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, r> f18710b;

    public g() {
        this.f18709a = new TreeMap();
        this.f18710b = new TreeMap();
    }

    public g(List<r> list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                B(i8, list.get(i8));
            }
        }
    }

    public g(r... rVarArr) {
        this((List<r>) Arrays.asList(rVarArr));
    }

    public final void A(int i8) {
        int iIntValue = this.f18709a.lastKey().intValue();
        if (i8 > iIntValue || i8 < 0) {
            return;
        }
        this.f18709a.remove(Integer.valueOf(i8));
        if (i8 == iIntValue) {
            int i9 = i8 - 1;
            if (this.f18709a.containsKey(Integer.valueOf(i9)) || i9 < 0) {
                return;
            }
            this.f18709a.put(Integer.valueOf(i9), r.L);
            return;
        }
        while (true) {
            i8++;
            if (i8 > this.f18709a.lastKey().intValue()) {
                return;
            }
            r rVar = this.f18709a.get(Integer.valueOf(i8));
            if (rVar != null) {
                this.f18709a.put(Integer.valueOf(i8 - 1), rVar);
                this.f18709a.remove(Integer.valueOf(i8));
            }
        }
    }

    public final void B(int i8, r rVar) {
        if (i8 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
        }
        if (rVar == null) {
            this.f18709a.remove(Integer.valueOf(i8));
        } else {
            this.f18709a.put(Integer.valueOf(i8), rVar);
        }
    }

    public final boolean C(int i8) {
        if (i8 >= 0 && i8 <= this.f18709a.lastKey().intValue()) {
            return this.f18709a.containsKey(Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
    }

    public final Iterator<Integer> D() {
        return this.f18709a.keySet().iterator();
    }

    public final List<r> E() {
        ArrayList arrayList = new ArrayList(y());
        for (int i8 = 0; i8 < y(); i8++) {
            arrayList.add(v(i8));
        }
        return arrayList;
    }

    public final void H() {
        this.f18709a.clear();
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final r a(String str) {
        r rVar;
        return "length".equals(str) ? new j(Double.valueOf(y())) : (!e(str) || (rVar = this.f18710b.get(str)) == null) ? r.L : rVar;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final boolean e(String str) {
        return "length".equals(str) || this.f18710b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (y() != gVar.y()) {
            return false;
        }
        if (this.f18709a.isEmpty()) {
            return gVar.f18709a.isEmpty();
        }
        for (int iIntValue = this.f18709a.firstKey().intValue(); iIntValue <= this.f18709a.lastKey().intValue(); iIntValue++) {
            if (!v(iIntValue).equals(gVar.v(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        return "concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str) ? g0.d(str, this, b7Var, list) : o.a(this, new t(str), b7Var, list);
    }

    public final int hashCode() {
        return this.f18709a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final void i(String str, r rVar) {
        if (rVar == null) {
            this.f18710b.remove(str);
        } else {
            this.f18710b.put(str, rVar);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<r> iterator() {
        return new i(this);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        SortedMap<Integer, r> sortedMap;
        Integer key;
        r rVarL;
        g gVar = new g();
        for (Map.Entry<Integer, r> entry : this.f18709a.entrySet()) {
            if (entry.getValue() instanceof l) {
                sortedMap = gVar.f18709a;
                key = entry.getKey();
                rVarL = entry.getValue();
            } else {
                sortedMap = gVar.f18709a;
                key = entry.getKey();
                rVarL = entry.getValue().l();
            }
            sortedMap.put(key, rVarL);
        }
        return gVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        return this.f18709a.size() == 1 ? v(0).m() : this.f18709a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        return toString();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return new f(this, this.f18709a.keySet().iterator(), this.f18710b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        return Boolean.TRUE;
    }

    public final String toString() {
        return z(com.amazon.a.a.o.b.f.f3942a);
    }

    public final int u() {
        return this.f18709a.size();
    }

    public final r v(int i8) {
        r rVar;
        if (i8 < y()) {
            return (!C(i8) || (rVar = this.f18709a.get(Integer.valueOf(i8))) == null) ? r.L : rVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void w(int i8, r rVar) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i8);
        }
        if (i8 >= y()) {
            B(i8, rVar);
            return;
        }
        for (int iIntValue = this.f18709a.lastKey().intValue(); iIntValue >= i8; iIntValue--) {
            r rVar2 = this.f18709a.get(Integer.valueOf(iIntValue));
            if (rVar2 != null) {
                B(iIntValue + 1, rVar2);
                this.f18709a.remove(Integer.valueOf(iIntValue));
            }
        }
        B(i8, rVar);
    }

    public final void x(r rVar) {
        B(y(), rVar);
    }

    public final int y() {
        if (this.f18709a.isEmpty()) {
            return 0;
        }
        return this.f18709a.lastKey().intValue() + 1;
    }

    public final String z(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f18709a.isEmpty()) {
            for (int i8 = 0; i8 < y(); i8++) {
                r rVarV = v(i8);
                sb.append(str);
                if (!(rVarV instanceof y) && !(rVarV instanceof p)) {
                    sb.append(rVarV.n());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }
}
