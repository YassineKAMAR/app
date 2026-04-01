package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.he;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends u6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f20279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p4 f20282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p4 f20283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p4 f20284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p4 f20285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p4 f20286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p4 f20287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p4 f20288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p4 f20289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p4 f20290n;

    n4(w5 w5Var) {
        super(w5Var);
        this.f20279c = (char) 0;
        this.f20280d = -1L;
        this.f20282f = new p4(this, 6, false, false);
        this.f20283g = new p4(this, 6, true, false);
        this.f20284h = new p4(this, 6, false, true);
        this.f20285i = new p4(this, 5, false, false);
        this.f20286j = new p4(this, 5, true, false);
        this.f20287k = new p4(this, 5, false, true);
        this.f20288l = new p4(this, 4, false, false);
        this.f20289m = new p4(this, 3, false, false);
        this.f20290n = new p4(this, 2, false, false);
    }

    private static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? (he.a() && e0.H0.a(null).booleanValue()) ? "" : str : str.substring(0, iLastIndexOf);
    }

    private final String P() {
        String str;
        synchronized (this) {
            if (this.f20281e == null) {
                this.f20281e = this.f20556a.O() != null ? this.f20556a.O() : "FA";
            }
            a3.o.j(this.f20281e);
            str = this.f20281e;
        }
        return str;
    }

    protected static Object v(String str) {
        if (str == null) {
            return null;
        }
        return new s4(str);
    }

    private static String w(boolean z7, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i8 = 0;
        if (obj instanceof Long) {
            if (!z7) {
                return String.valueOf(obj);
            }
            Long l8 = (Long) obj;
            if (Math.abs(l8.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l8.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof s4 ? ((s4) obj).f20475a : z7 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z7 ? th.getClass().getName() : th.toString());
        String strE = E(w5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(strE)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i8++;
        }
        return sb.toString();
    }

    static String x(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strW = w(z7, obj);
        String strW2 = w(z7, obj2);
        String strW3 = w(z7, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strW)) {
            sb.append(str2);
            sb.append(strW);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strW2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strW2);
        }
        if (!TextUtils.isEmpty(strW3)) {
            sb.append(str3);
            sb.append(strW3);
        }
        return sb.toString();
    }

    protected final boolean C(int i8) {
        return Log.isLoggable(P(), i8);
    }

    public final p4 F() {
        return this.f20289m;
    }

    public final p4 G() {
        return this.f20282f;
    }

    public final p4 H() {
        return this.f20284h;
    }

    public final p4 I() {
        return this.f20283g;
    }

    public final p4 J() {
        return this.f20288l;
    }

    public final p4 K() {
        return this.f20290n;
    }

    public final p4 L() {
        return this.f20285i;
    }

    public final p4 M() {
        return this.f20287k;
    }

    public final p4 N() {
        return this.f20286j;
    }

    public final String O() {
        Pair<String, Long> pairA;
        if (e().f20698d == null || (pairA = e().f20698d.a()) == null || pairA == y4.f20696z) {
            return null;
        }
        return String.valueOf(pairA.second) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + ((String) pairA.first);
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

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
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

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean q() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    protected final void y(int i8, String str) {
        Log.println(i8, P(), str);
    }

    protected final void z(int i8, boolean z7, boolean z8, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z7 && C(i8)) {
            y(i8, x(false, str, obj, obj2, obj3));
        }
        if (z8 || i8 < 5) {
            return;
        }
        a3.o.j(str);
        q5 q5VarG = this.f20556a.G();
        if (q5VarG == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (q5VarG.o()) {
                if (i8 < 0) {
                    i8 = 0;
                }
                q5VarG.D(new q4(this, i8 >= 9 ? 8 : i8, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        y(6, str2);
    }
}
