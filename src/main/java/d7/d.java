package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f21012a = new h0("CLOSED");

    public static final <N extends e<N>> N b(N n8) {
        while (true) {
            Object objF = n8.f();
            if (objF == f21012a) {
                return n8;
            }
            e eVar = (e) objF;
            if (eVar != null) {
                n8 = (N) eVar;
            } else if (n8.j()) {
                return n8;
            }
        }
    }

    public static final <S extends e0<S>> Object c(S s8, long j8, p6.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s8.f21017c >= j8 && !s8.h()) {
                return f0.a(s8);
            }
            Object objF = s8.f();
            if (objF == f21012a) {
                return f0.a(f21012a);
            }
            S sInvoke = (S) ((e) objF);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s8.f21017c + 1), s8);
                if (s8.l(sInvoke)) {
                    if (s8.h()) {
                        s8.k();
                    }
                }
            }
            s8 = (Object) sInvoke;
        }
    }
}
