package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b9 implements p8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f5658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5659c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5662f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f5657a = new dq2(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5660d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.p8
    public final void a(dq2 dq2Var) {
        uu1.b(this.f5658b);
        if (this.f5659c) {
            int iJ = dq2Var.j();
            int i8 = this.f5662f;
            if (i8 < 10) {
                int iMin = Math.min(iJ, 10 - i8);
                System.arraycopy(dq2Var.i(), dq2Var.l(), this.f5657a.i(), this.f5662f, iMin);
                if (this.f5662f + iMin == 10) {
                    this.f5657a.g(0);
                    if (this.f5657a.u() != 73 || this.f5657a.u() != 68 || this.f5657a.u() != 51) {
                        pf2.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5659c = false;
                        return;
                    } else {
                        this.f5657a.h(3);
                        this.f5661e = this.f5657a.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iJ, this.f5661e - this.f5662f);
            this.f5658b.d(dq2Var, iMin2);
            this.f5662f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
        int i8;
        uu1.b(this.f5658b);
        if (this.f5659c && (i8 = this.f5661e) != 0 && this.f5662f == i8) {
            long j8 = this.f5660d;
            if (j8 != -9223372036854775807L) {
                this.f5658b.a(j8, 1, i8, 0, null);
            }
            this.f5659c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        w1 w1VarF = s0Var.f(caVar.a(), 5);
        this.f5658b = w1VarF;
        l9 l9Var = new l9();
        l9Var.j(caVar.b());
        l9Var.u("application/id3");
        w1VarF.e(l9Var.D());
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if ((i8 & 4) == 0) {
            return;
        }
        this.f5659c = true;
        if (j8 != -9223372036854775807L) {
            this.f5660d = j8;
        }
        this.f5661e = 0;
        this.f5662f = 0;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f5659c = false;
        this.f5660d = -9223372036854775807L;
    }
}
