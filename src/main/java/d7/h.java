package d7;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final void a(h6.g gVar, Throwable th) {
        Iterator<y6.c0> it = g.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().t(gVar, th);
            } catch (Throwable th2) {
                g.b(y6.d0.b(th, th2));
            }
        }
        try {
            e6.f.a(th, new i(gVar));
        } catch (Throwable unused) {
        }
        g.b(th);
    }
}
