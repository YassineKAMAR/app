package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b9 {
    public static r a(p5 p5Var) {
        if (p5Var == null) {
            return r.L;
        }
        int i8 = c8.f18620a[p5Var.G().ordinal()];
        if (i8 == 1) {
            return p5Var.O() ? new t(p5Var.J()) : r.S;
        }
        if (i8 == 2) {
            return p5Var.N() ? new j(Double.valueOf(p5Var.F())) : new j(null);
        }
        if (i8 == 3) {
            return p5Var.M() ? new h(Boolean.valueOf(p5Var.L())) : new h(null);
        }
        if (i8 != 4) {
            if (i8 == 5) {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new IllegalStateException("Invalid entity: " + String.valueOf(p5Var));
        }
        List<p5> listK = p5Var.K();
        ArrayList arrayList = new ArrayList();
        Iterator<p5> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new u(p5Var.I(), arrayList);
    }

    public static r b(Object obj) {
        if (obj == null) {
            return r.M;
        }
        if (obj instanceof String) {
            return new t((String) obj);
        }
        if (obj instanceof Double) {
            return new j((Double) obj);
        }
        if (obj instanceof Long) {
            return new j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            g gVar = new g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                gVar.x(b(it.next()));
            }
            return gVar;
        }
        q qVar = new q();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            r rVarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                qVar.i((String) string, rVarB);
            }
        }
        return qVar;
    }
}
