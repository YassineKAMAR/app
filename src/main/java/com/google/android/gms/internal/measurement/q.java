package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q implements l, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, r> f19054a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.l
    public final r a(String str) {
        return this.f19054a.containsKey(str) ? this.f19054a.get(str) : r.L;
    }

    public final List<String> b() {
        return new ArrayList(this.f19054a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final boolean e(String str) {
        return this.f19054a.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f19054a.equals(((q) obj).f19054a);
        }
        return false;
    }

    public r g(String str, b7 b7Var, List<r> list) {
        return "toString".equals(str) ? new t(toString()) : o.a(this, new t(str), b7Var, list);
    }

    public int hashCode() {
        return this.f19054a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final void i(String str, r rVar) {
        if (rVar == null) {
            this.f19054a.remove(str);
        } else {
            this.f19054a.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        Map<String, r> map;
        String key;
        r rVarL;
        q qVar = new q();
        for (Map.Entry<String, r> entry : this.f19054a.entrySet()) {
            if (entry.getValue() instanceof l) {
                map = qVar.f19054a;
                key = entry.getKey();
                rVarL = entry.getValue();
            } else {
                map = qVar.f19054a;
                key = entry.getKey();
                rVarL = entry.getValue().l();
            }
            map.put(key, rVarL);
        }
        return qVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return o.b(this.f19054a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        return Boolean.TRUE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f19054a.isEmpty()) {
            for (String str : this.f19054a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f19054a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(com.amazon.a.a.o.b.f.f3942a));
        }
        sb.append("}");
        return sb.toString();
    }
}
