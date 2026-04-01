package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.ge;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.d5 f20464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BitSet f20465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BitSet f20466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<Integer, Long> f20467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<Integer, List<Long>> f20468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ pb f20469h;

    private rb(pb pbVar, String str) {
        this.f20469h = pbVar;
        this.f20462a = str;
        this.f20463b = true;
        this.f20465d = new BitSet();
        this.f20466e = new BitSet();
        this.f20467f = new p.a();
        this.f20468g = new p.a();
    }

    private rb(pb pbVar, String str, com.google.android.gms.internal.measurement.d5 d5Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f20469h = pbVar;
        this.f20462a = str;
        this.f20465d = bitSet;
        this.f20466e = bitSet2;
        this.f20467f = map;
        this.f20468g = new p.a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f20468g.put(num, arrayList);
            }
        }
        this.f20463b = false;
        this.f20464c = d5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.u4$a, com.google.android.gms.internal.measurement.y8$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.measurement.d5$a] */
    final com.google.android.gms.internal.measurement.u4 a(int i8) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? L = com.google.android.gms.internal.measurement.u4.L();
        L.s(i8);
        L.v(this.f20463b);
        com.google.android.gms.internal.measurement.d5 d5Var = this.f20464c;
        if (d5Var != null) {
            L.u(d5Var);
        }
        ?? Z = com.google.android.gms.internal.measurement.d5.U().v(db.M(this.f20465d)).z(db.M(this.f20466e));
        if (this.f20467f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f20467f.size());
            Iterator<Integer> it = this.f20467f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                Long l8 = this.f20467f.get(Integer.valueOf(iIntValue));
                if (l8 != null) {
                    arrayList.add((com.google.android.gms.internal.measurement.v4) ((com.google.android.gms.internal.measurement.y8) com.google.android.gms.internal.measurement.v4.K().s(iIntValue).t(l8.longValue()).d()));
                }
            }
        }
        if (arrayList != null) {
            Z.t(arrayList);
        }
        if (this.f20468g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f20468g.size());
            for (Integer num : this.f20468g.keySet()) {
                e5.a aVarS = com.google.android.gms.internal.measurement.e5.L().s(num.intValue());
                List<Long> list = this.f20468g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    aVarS.t(list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.e5) ((com.google.android.gms.internal.measurement.y8) aVarS.d()));
            }
        }
        Z.x(arrayList2);
        L.t(Z);
        return (com.google.android.gms.internal.measurement.u4) ((com.google.android.gms.internal.measurement.y8) L.d());
    }

    final void c(c cVar) {
        int iA = cVar.a();
        Boolean bool = cVar.f19848c;
        if (bool != null) {
            this.f20466e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = cVar.f19849d;
        if (bool2 != null) {
            this.f20465d.set(iA, bool2.booleanValue());
        }
        if (cVar.f19850e != null) {
            Long l8 = this.f20467f.get(Integer.valueOf(iA));
            long jLongValue = cVar.f19850e.longValue() / 1000;
            if (l8 == null || jLongValue > l8.longValue()) {
                this.f20467f.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (cVar.f19851f != null) {
            List<Long> arrayList = this.f20468g.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f20468g.put(Integer.valueOf(iA), arrayList);
            }
            if (cVar.j()) {
                arrayList.clear();
            }
            if (ge.a() && this.f20469h.a().D(this.f20462a, e0.f19942j0) && cVar.i()) {
                arrayList.clear();
            }
            if (!ge.a() || !this.f20469h.a().D(this.f20462a, e0.f19942j0)) {
                arrayList.add(Long.valueOf(cVar.f19851f.longValue() / 1000));
                return;
            }
            long jLongValue2 = cVar.f19851f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }
}
