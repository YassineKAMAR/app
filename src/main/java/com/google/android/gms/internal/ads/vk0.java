package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class vk0 extends pk0 implements g94 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cj0 f16307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uk0 f16309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zj0 f16310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ByteBuffer f16311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f16312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f16313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f16314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f16315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16316n;

    public vk0(dj0 dj0Var, cj0 cj0Var) {
        super(dj0Var);
        this.f16307e = cj0Var;
        this.f16309g = new uk0();
        this.f16310h = new zj0();
        this.f16313k = new Object();
        this.f16314l = (String) h83.d(dj0Var != null ? dj0Var.B() : null).b("");
        this.f16315m = dj0Var != null ? dj0Var.n() : 0;
    }

    private final void A() {
        int iA = (int) this.f16309g.a();
        int iA2 = (int) this.f16310h.a(this.f16311i);
        int iPosition = this.f16311i.position();
        int iRound = Math.round(iA2 * (iPosition / iA));
        int iO = ti0.O();
        int iQ = ti0.Q();
        String str = this.f16306d;
        o(str, B(str), iPosition, iA, iRound, iA2, iRound > 0, iO, iQ);
    }

    protected static final String B(String str) {
        return "cache:".concat(String.valueOf(jg0.i(str)));
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void e(po3 po3Var, ut3 ut3Var, boolean z7) {
        if (po3Var instanceof a24) {
            this.f16309g.b((a24) po3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void h() {
        this.f16308f = true;
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void i(po3 po3Var, ut3 ut3Var, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void j(po3 po3Var, ut3 ut3Var, boolean z7, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void m(po3 po3Var, ut3 ut3Var, boolean z7) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
    
        r21.f16316n = true;
        n(r22, r4, (int) r21.f16310h.a(r21.f16311i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:45:0x0142). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vk0.u(java.lang.String):boolean");
    }

    public final String x() {
        return this.f16306d;
    }

    public final ByteBuffer y() {
        synchronized (this.f16313k) {
            ByteBuffer byteBuffer = this.f16311i;
            if (byteBuffer != null && !this.f16312j) {
                byteBuffer.flip();
                this.f16312j = true;
            }
            this.f16308f = true;
        }
        return this.f16311i;
    }

    public final boolean z() {
        return this.f16316n;
    }
}
