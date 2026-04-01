package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
final class rn4 implements hr4, im4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f14240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f94 f14241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ln4 f14242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s0 f14243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yx1 f14244f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f14246h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f14248j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w1 f14250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ xn4 f14252n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n1 f14245g = new n1();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f14247i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14239a = km4.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ut3 f14249k = g(0);

    public rn4(xn4 xn4Var, Uri uri, po3 po3Var, ln4 ln4Var, s0 s0Var, yx1 yx1Var) {
        this.f14252n = xn4Var;
        this.f14240b = uri;
        this.f14241c = new f94(po3Var);
        this.f14242d = ln4Var;
        this.f14243e = s0Var;
        this.f14244f = yx1Var;
    }

    static /* bridge */ /* synthetic */ void f(rn4 rn4Var, long j8, long j9) {
        rn4Var.f14245g.f11591a = j8;
        rn4Var.f14248j = j9;
        rn4Var.f14247i = true;
        rn4Var.f14251m = false;
    }

    private final ut3 g(long j8) {
        sr3 sr3Var = new sr3();
        sr3Var.d(this.f14240b);
        sr3Var.c(j8);
        sr3Var.a(6);
        sr3Var.b(xn4.Z);
        return sr3Var.e();
    }

    @Override // com.google.android.gms.internal.ads.im4
    public final void a(dq2 dq2Var) {
        long jMax = !this.f14251m ? this.f14248j : Math.max(xn4.T(this.f14252n, true), this.f14248j);
        int iJ = dq2Var.j();
        w1 w1Var = this.f14250l;
        w1Var.getClass();
        u1.b(w1Var, dq2Var, iJ);
        w1Var.a(jMax, 1, iJ, 0, null);
        this.f14251m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[LOOP:0: B:3:0x0004->B:122:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    @Override // com.google.android.gms.internal.ads.hr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rn4.o():void");
    }

    @Override // com.google.android.gms.internal.ads.hr4
    public final void q() {
        this.f14246h = true;
    }
}
