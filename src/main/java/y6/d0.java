package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final void a(h6.g gVar, Throwable th) {
        try {
            c0 c0Var = (c0) gVar.a(c0.U);
            if (c0Var != null) {
                c0Var.t(gVar, th);
            } else {
                d7.h.a(gVar, th);
            }
        } catch (Throwable th2) {
            d7.h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        e6.f.a(runtimeException, th);
        return runtimeException;
    }
}
