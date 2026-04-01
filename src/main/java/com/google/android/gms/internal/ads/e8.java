package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class e8 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cp2 f7169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f7170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w1 f7173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f7177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private nb f7178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f7180l;

    public e8(String str) {
        cp2 cp2Var = new cp2(new byte[128], 128);
        this.f7169a = cp2Var;
        this.f7170b = new dq2(cp2Var.f6432a);
        this.f7174f = 0;
        this.f7180l = -9223372036854775807L;
        this.f7171c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    @Override // com.google.android.gms.internal.ads.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.dq2 r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e8.a(com.google.android.gms.internal.ads.dq2):void");
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f7172d = caVar.b();
        this.f7173e = s0Var.f(caVar.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f7180l = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f7174f = 0;
        this.f7175g = 0;
        this.f7176h = false;
        this.f7180l = -9223372036854775807L;
    }
}
