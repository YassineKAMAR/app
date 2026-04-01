package d7;

import y6.u1;

/* JADX INFO: loaded from: classes2.dex */
final class y extends u1 implements y6.n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f21076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21077d;

    public y(Throwable th, String str) {
        this.f21076c = th;
        this.f21077d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void k0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f21076c
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f21077d
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f21076c
            r1.<init>(r0, r2)
            throw r1
        L36:
            d7.x.d()
            e6.h r0 = new e6.h
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.y.k0():java.lang.Void");
    }

    @Override // y6.b0
    public boolean f0(h6.g gVar) {
        k0();
        throw new e6.h();
    }

    @Override // y6.u1
    public u1 h0() {
        return this;
    }

    @Override // y6.b0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public Void e0(h6.g gVar, Runnable runnable) {
        k0();
        throw new e6.h();
    }

    @Override // y6.u1, y6.b0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f21076c != null) {
            str = ", cause=" + this.f21076c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
