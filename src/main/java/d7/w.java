package d7;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import y6.u1;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f21072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f21073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f21074c;

    static {
        w wVar = new w();
        f21072a = wVar;
        f21073b = i0.f("kotlinx.coroutines.fast.service.loader", true);
        f21074c = wVar.a();
    }

    private w() {
    }

    private final u1 a() {
        Object next;
        u1 u1VarE;
        try {
            List<v> listC = f21073b ? l.f21033a.c() : v6.h.e(v6.f.a(ServiceLoader.load(v.class, v.class.getClassLoader()).iterator()));
            Iterator<T> it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((v) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((v) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            v vVar = (v) next;
            return (vVar == null || (u1VarE = x.e(vVar, listC)) == null) ? x.b(null, null, 3, null) : u1VarE;
        } catch (Throwable th) {
            return x.b(th, null, 2, null);
        }
    }
}
