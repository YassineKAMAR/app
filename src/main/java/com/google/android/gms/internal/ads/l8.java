package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l8 implements p8 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f10498v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cp2 f10500b = new cp2(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f10501c = new dq2(Arrays.copyOf(f10498v, 10));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w1 f10504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w1 f10505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f10513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f10515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f10517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private w1 f10518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f10519u;

    public l8(boolean z7, String str) {
        g();
        this.f10511m = -1;
        this.f10512n = -1;
        this.f10515q = -9223372036854775807L;
        this.f10517s = -9223372036854775807L;
        this.f10499a = z7;
        this.f10502d = str;
    }

    public static boolean e(int i8) {
        return (i8 & 65526) == 65520;
    }

    private final void f() {
        this.f10510l = false;
        g();
    }

    private final void g() {
        this.f10506h = 0;
        this.f10507i = 0;
        this.f10508j = 256;
    }

    private final void h() {
        this.f10506h = 3;
        this.f10507i = 0;
    }

    private final void i(w1 w1Var, long j8, int i8, int i9) {
        this.f10506h = 4;
        this.f10507i = i8;
        this.f10518t = w1Var;
        this.f10519u = j8;
        this.f10516r = i9;
    }

    private final boolean j(dq2 dq2Var, byte[] bArr, int i8) {
        int iMin = Math.min(dq2Var.j(), i8 - this.f10507i);
        dq2Var.c(bArr, this.f10507i, iMin);
        int i9 = this.f10507i + iMin;
        this.f10507i = i9;
        return i9 == i8;
    }

    private static final boolean k(byte b8, byte b9) {
        return e((b9 & 255) | 65280);
    }

    private static final boolean l(dq2 dq2Var, byte[] bArr, int i8) {
        if (dq2Var.j() < i8) {
            return false;
        }
        dq2Var.c(bArr, 0, i8);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    @Override // com.google.android.gms.internal.ads.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.dq2 r17) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l8.a(com.google.android.gms.internal.ads.dq2):void");
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f10503e = caVar.b();
        w1 w1VarF = s0Var.f(caVar.a(), 1);
        this.f10504f = w1VarF;
        this.f10518t = w1VarF;
        if (!this.f10499a) {
            this.f10505g = new o0();
            return;
        }
        caVar.c();
        w1 w1VarF2 = s0Var.f(caVar.a(), 5);
        this.f10505g = w1VarF2;
        l9 l9Var = new l9();
        l9Var.j(caVar.b());
        l9Var.u("application/id3");
        w1VarF2.e(l9Var.D());
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f10517s = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f10517s = -9223372036854775807L;
        f();
    }
}
