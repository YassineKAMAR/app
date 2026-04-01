package n7;

import kotlin.jvm.internal.z;
import o7.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static final v a(Boolean bool) {
        return bool == null ? r.f25207c : new o(bool, false);
    }

    public static final v b(Number number) {
        return number == null ? r.f25207c : new o(number, false);
    }

    public static final v c(String str) {
        return str == null ? r.f25207c : new o(str, true);
    }

    private static final Void d(h hVar, String str) {
        throw new IllegalArgumentException("Element " + z.b(hVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return v0.d(vVar.a());
    }

    public static final String f(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        if (vVar instanceof r) {
            return null;
        }
        return vVar.a();
    }

    public static final double g(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return Double.parseDouble(vVar.a());
    }

    public static final Double h(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return w6.t.f(vVar.a());
    }

    public static final float i(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return Float.parseFloat(vVar.a());
    }

    public static final Float j(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return w6.t.g(vVar.a());
    }

    public static final int k(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return Integer.parseInt(vVar.a());
    }

    public static final Integer l(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return w6.u.i(vVar.a());
    }

    public static final b m(h hVar) {
        kotlin.jvm.internal.q.f(hVar, "<this>");
        b bVar = hVar instanceof b ? (b) hVar : null;
        if (bVar != null) {
            return bVar;
        }
        d(hVar, "JsonArray");
        throw new e6.h();
    }

    public static final t n(h hVar) {
        kotlin.jvm.internal.q.f(hVar, "<this>");
        t tVar = hVar instanceof t ? (t) hVar : null;
        if (tVar != null) {
            return tVar;
        }
        d(hVar, "JsonObject");
        throw new e6.h();
    }

    public static final v o(h hVar) {
        kotlin.jvm.internal.q.f(hVar, "<this>");
        v vVar = hVar instanceof v ? (v) hVar : null;
        if (vVar != null) {
            return vVar;
        }
        d(hVar, "JsonPrimitive");
        throw new e6.h();
    }

    public static final long p(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return Long.parseLong(vVar.a());
    }

    public static final Long q(v vVar) {
        kotlin.jvm.internal.q.f(vVar, "<this>");
        return w6.u.k(vVar.a());
    }
}
