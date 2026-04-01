package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.lg;
import com.google.android.gms.measurement.internal.y6;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f20087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<String> f20090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f20091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f20093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f20094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f20095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f20096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f20097q;

    i4(w5 w5Var, long j8) {
        super(w5Var);
        this.f20096p = 0L;
        this.f20097q = null;
        this.f20089i = j8;
    }

    private final String J() {
        p4 p4VarN;
        String str;
        if (lg.a() && a().q(e0.f19950n0)) {
            p4VarN = t().K();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> clsLoadClass = j().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    return null;
                }
                try {
                    Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, j());
                    if (objInvoke == null) {
                        return null;
                    }
                    try {
                        return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                    } catch (Exception unused) {
                        p4VarN = t().M();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    p4VarN = t().N();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        p4VarN.a(str);
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean A() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.lb B(java.lang.String r47) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.B(java.lang.String):com.google.android.gms.measurement.internal.lb");
    }

    final int C() {
        v();
        return this.f20092l;
    }

    final int D() {
        v();
        return this.f20085e;
    }

    final String E() {
        v();
        return this.f20094n;
    }

    final String F() {
        v();
        a3.o.j(this.f20083c);
        return this.f20083c;
    }

    final String G() {
        i();
        v();
        a3.o.j(this.f20093m);
        return this.f20093m;
    }

    final List<String> H() {
        return this.f20090j;
    }

    final void I() {
        String str;
        i();
        if (e().J().l(y6.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            f().U0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            t().F().a("Analytics Storage consent is not granted");
            str = null;
        }
        p4 p4VarF = t().F();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        p4VarF.a(String.format("Resetting session stitching token to %s", objArr));
        this.f20095o = str;
        this.f20096p = k().a();
    }

    final boolean K(String str) {
        String str2 = this.f20097q;
        boolean z7 = (str2 == null || str2.equals(str)) ? false : true;
        this.f20097q = str;
        return z7;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(1:4)(24:88|6|(1:10)(2:11|(1:13))|86|14|(4:16|(1:18)(1:20)|90|21)|26|(1:31)(1:30)|32|SW:33|44|(1:46)(1:47)|48|(1:50)|92|51|(1:53)(1:54)|55|(1:57)|(3:59|(1:61)(1:62)|63)|67|(3:69|(1:71)(3:73|(3:76|(1:95)(1:96)|74)|94)|72)|(1:80)|(2:82|83)(2:84|85))|5|26|(2:28|31)(0)|32|SW:33|44|(0)(0)|48|(0)|92|51|(0)(0)|55|(0)|(0)|67|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018b, code lost:
    
        t().G().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.n4.v(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154 A[Catch: IllegalStateException -> 0x018a, TryCatch #3 {IllegalStateException -> 0x018a, blocks: (B:51:0x012f, B:55:0x014c, B:57:0x0154, B:59:0x016d, B:61:0x0181, B:63:0x0186, B:62:0x0184), top: B:92:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d A[Catch: IllegalStateException -> 0x018a, TryCatch #3 {IllegalStateException -> 0x018a, blocks: (B:51:0x012f, B:55:0x014c, B:57:0x0154, B:59:0x016d, B:61:0x0181, B:63:0x0186, B:62:0x0184), top: B:92:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ee  */
    @Override // com.google.android.gms.measurement.internal.y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void y() {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.y():void");
    }
}
