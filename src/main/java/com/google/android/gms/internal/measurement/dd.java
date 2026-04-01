package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f18654b;

    public dd(d dVar) {
        this.f18654b = dVar;
    }

    @Override // com.google.android.gms.internal.measurement.q, com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        str.hashCode();
        switch (str) {
            case "getEventName":
                a6.g("getEventName", 0, list);
                return new t(this.f18654b.d().e());
            case "getTimestamp":
                a6.g("getTimestamp", 0, list);
                return new j(Double.valueOf(this.f18654b.d().a()));
            case "getParamValue":
                a6.g("getParamValue", 1, list);
                return b9.b(this.f18654b.d().b(b7Var.b(list.get(0)).n()));
            case "getParams":
                a6.g("getParams", 0, list);
                Map<String, Object> mapG = this.f18654b.d().g();
                q qVar = new q();
                for (String str2 : mapG.keySet()) {
                    qVar.i(str2, b9.b(mapG.get(str2)));
                }
                return qVar;
            case "setParamValue":
                a6.g("setParamValue", 2, list);
                String strN = b7Var.b(list.get(0)).n();
                r rVarB = b7Var.b(list.get(1));
                this.f18654b.d().d(strN, a6.d(rVarB));
                return rVarB;
            case "setEventName":
                a6.g("setEventName", 1, list);
                r rVarB2 = b7Var.b(list.get(0));
                if (r.L.equals(rVarB2) || r.M.equals(rVarB2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f18654b.d().f(rVarB2.n());
                return new t(rVarB2.n());
            default:
                return super.g(str, b7Var, list);
        }
    }
}
