package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o0 writer, boolean z7) {
        super(writer);
        kotlin.jvm.internal.q.f(writer, "writer");
        this.f25365c = z7;
    }

    @Override // o7.k
    public void d(byte b8) {
        boolean z7 = this.f25365c;
        String strG = e6.y.g(e6.y.c(b8));
        if (z7) {
            m(strG);
        } else {
            j(strG);
        }
    }

    @Override // o7.k
    public void h(int i8) {
        boolean z7 = this.f25365c;
        int iC = e6.a0.c(i8);
        if (z7) {
            m(Long.toString(((long) iC) & 4294967295L, 10));
        } else {
            j(Long.toString(((long) iC) & 4294967295L, 10));
        }
    }

    @Override // o7.k
    public void i(long j8) {
        boolean z7 = this.f25365c;
        long jC = e6.c0.c(j8);
        if (z7) {
            m(q.a(jC, 10));
        } else {
            j(p.a(jC, 10));
        }
    }

    @Override // o7.k
    public void k(short s8) {
        boolean z7 = this.f25365c;
        String strG = e6.f0.g(e6.f0.c(s8));
        if (z7) {
            m(strG);
        } else {
            j(strG);
        }
    }
}
