package o7;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f25330a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f6.e<char[]> f25331b = new f6.e<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f25333d;

    static {
        Object objB;
        try {
            s.a aVar = e6.s.f21442b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.q.e(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            objB = e6.s.b(w6.u.i(property));
        } catch (Throwable th) {
            s.a aVar2 = e6.s.f21442b;
            objB = e6.s.b(e6.t.a(th));
        }
        if (e6.s.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f25333d = num != null ? num.intValue() : 1048576;
    }

    private i() {
    }

    public final void a(char[] array) {
        kotlin.jvm.internal.q.f(array, "array");
        synchronized (this) {
            int i8 = f25332c;
            if (array.length + i8 < f25333d) {
                f25332c = i8 + array.length;
                f25331b.addLast(array);
            }
            e6.i0 i0Var = e6.i0.f21430a;
        }
    }

    public final char[] b() {
        char[] cArrY;
        synchronized (this) {
            cArrY = f25331b.y();
            if (cArrY != null) {
                f25332c -= cArrY.length;
            } else {
                cArrY = null;
            }
        }
        return cArrY == null ? new char[128] : cArrY;
    }
}
