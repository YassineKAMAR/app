package m7;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<u6.c<? extends Object>, i7.b<? extends Object>> f25041a = f6.k0.g(e6.x.a(kotlin.jvm.internal.z.b(String.class), j7.a.G(kotlin.jvm.internal.c0.f24298a)), e6.x.a(kotlin.jvm.internal.z.b(Character.TYPE), j7.a.A(kotlin.jvm.internal.f.f24308a)), e6.x.a(kotlin.jvm.internal.z.b(char[].class), j7.a.d()), e6.x.a(kotlin.jvm.internal.z.b(Double.TYPE), j7.a.B(kotlin.jvm.internal.k.f24317a)), e6.x.a(kotlin.jvm.internal.z.b(double[].class), j7.a.e()), e6.x.a(kotlin.jvm.internal.z.b(Float.TYPE), j7.a.C(kotlin.jvm.internal.l.f24318a)), e6.x.a(kotlin.jvm.internal.z.b(float[].class), j7.a.f()), e6.x.a(kotlin.jvm.internal.z.b(Long.TYPE), j7.a.E(kotlin.jvm.internal.s.f24320a)), e6.x.a(kotlin.jvm.internal.z.b(long[].class), j7.a.i()), e6.x.a(kotlin.jvm.internal.z.b(e6.c0.class), j7.a.v(e6.c0.f21409b)), e6.x.a(kotlin.jvm.internal.z.b(e6.d0.class), j7.a.q()), e6.x.a(kotlin.jvm.internal.z.b(Integer.TYPE), j7.a.D(kotlin.jvm.internal.p.f24319a)), e6.x.a(kotlin.jvm.internal.z.b(int[].class), j7.a.g()), e6.x.a(kotlin.jvm.internal.z.b(e6.a0.class), j7.a.u(e6.a0.f21403b)), e6.x.a(kotlin.jvm.internal.z.b(e6.b0.class), j7.a.p()), e6.x.a(kotlin.jvm.internal.z.b(Short.TYPE), j7.a.F(kotlin.jvm.internal.b0.f24296a)), e6.x.a(kotlin.jvm.internal.z.b(short[].class), j7.a.m()), e6.x.a(kotlin.jvm.internal.z.b(e6.f0.class), j7.a.w(e6.f0.f21419b)), e6.x.a(kotlin.jvm.internal.z.b(e6.g0.class), j7.a.r()), e6.x.a(kotlin.jvm.internal.z.b(Byte.TYPE), j7.a.z(kotlin.jvm.internal.d.f24299a)), e6.x.a(kotlin.jvm.internal.z.b(byte[].class), j7.a.c()), e6.x.a(kotlin.jvm.internal.z.b(e6.y.class), j7.a.t(e6.y.f21456b)), e6.x.a(kotlin.jvm.internal.z.b(e6.z.class), j7.a.o()), e6.x.a(kotlin.jvm.internal.z.b(Boolean.TYPE), j7.a.y(kotlin.jvm.internal.c.f24297a)), e6.x.a(kotlin.jvm.internal.z.b(boolean[].class), j7.a.b()), e6.x.a(kotlin.jvm.internal.z.b(e6.i0.class), j7.a.x(e6.i0.f21430a)), e6.x.a(kotlin.jvm.internal.z.b(x6.a.class), j7.a.H(x6.a.f27324b)));

    public static final k7.f a(String serialName, k7.e kind) {
        kotlin.jvm.internal.q.f(serialName, "serialName");
        kotlin.jvm.internal.q.f(kind, "kind");
        d(serialName);
        return new x1(serialName, kind);
    }

    public static final <T> i7.b<T> b(u6.c<T> cVar) {
        kotlin.jvm.internal.q.f(cVar, "<this>");
        return (i7.b) f25041a.get(cVar);
    }

    private static final String c(String str) {
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? w6.c.e(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    private static final void d(String str) {
        Iterator<u6.c<? extends Object>> it = f25041a.keySet().iterator();
        while (it.hasNext()) {
            String strB = it.next().b();
            kotlin.jvm.internal.q.c(strB);
            String strC = c(strB);
            if (w6.v.o(str, "kotlin." + strC, true) || w6.v.o(str, strC, true)) {
                throw new IllegalArgumentException(w6.o.e("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(strC) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
