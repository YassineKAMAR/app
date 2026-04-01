package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kn4 extends cm4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final c50 f10177t;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final vm4[] f10178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s11[] f10179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f10180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f10181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final fc3 f10182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long[][] f10184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private jn4 f10185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final em4 f10186s;

    static {
        rg rgVar = new rg();
        rgVar.a("MergingMediaSource");
        f10177t = rgVar.c();
    }

    public kn4(boolean z7, boolean z8, vm4... vm4VarArr) {
        em4 em4Var = new em4();
        this.f10178k = vm4VarArr;
        this.f10186s = em4Var;
        this.f10180m = new ArrayList(Arrays.asList(vm4VarArr));
        this.f10183p = -1;
        this.f10179l = new s11[vm4VarArr.length];
        this.f10184q = new long[0][];
        this.f10181n = new HashMap();
        this.f10182o = nc3.a(8).b(2).c();
    }

    @Override // com.google.android.gms.internal.ads.cm4, com.google.android.gms.internal.ads.vm4
    public final void W() throws jn4 {
        jn4 jn4Var = this.f10185r;
        if (jn4Var != null) {
            throw jn4Var;
        }
        super.W();
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void Y(rm4 rm4Var) {
        in4 in4Var = (in4) rm4Var;
        int i8 = 0;
        while (true) {
            vm4[] vm4VarArr = this.f10178k;
            if (i8 >= vm4VarArr.length) {
                return;
            }
            vm4VarArr[i8].Y(in4Var.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final rm4 Z(tm4 tm4Var, xq4 xq4Var, long j8) {
        s11[] s11VarArr = this.f10179l;
        int length = this.f10178k.length;
        rm4[] rm4VarArr = new rm4[length];
        int iA = s11VarArr[0].a(tm4Var.f15161a);
        for (int i8 = 0; i8 < length; i8++) {
            rm4VarArr[i8] = this.f10178k[i8].Z(tm4Var.a(this.f10179l[i8].f(iA)), xq4Var, j8 - this.f10184q[iA][i8]);
        }
        return new in4(this.f10186s, this.f10184q[iA], rm4VarArr);
    }

    @Override // com.google.android.gms.internal.ads.ul4, com.google.android.gms.internal.ads.vm4
    public final void d0(c50 c50Var) {
        this.f10178k[0].d0(c50Var);
    }

    @Override // com.google.android.gms.internal.ads.cm4, com.google.android.gms.internal.ads.ul4
    protected final void i(g94 g94Var) {
        super.i(g94Var);
        int i8 = 0;
        while (true) {
            vm4[] vm4VarArr = this.f10178k;
            if (i8 >= vm4VarArr.length) {
                return;
            }
            n(Integer.valueOf(i8), vm4VarArr[i8]);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.cm4, com.google.android.gms.internal.ads.ul4
    protected final void k() {
        super.k();
        Arrays.fill(this.f10179l, (Object) null);
        this.f10183p = -1;
        this.f10185r = null;
        this.f10180m.clear();
        Collections.addAll(this.f10180m, this.f10178k);
    }

    @Override // com.google.android.gms.internal.ads.cm4
    protected final /* bridge */ /* synthetic */ void m(Object obj, vm4 vm4Var, s11 s11Var) {
        int iB;
        if (this.f10185r != null) {
            return;
        }
        if (this.f10183p == -1) {
            iB = s11Var.b();
            this.f10183p = iB;
        } else {
            int iB2 = s11Var.b();
            int i8 = this.f10183p;
            if (iB2 != i8) {
                this.f10185r = new jn4(0);
                return;
            }
            iB = i8;
        }
        if (this.f10184q.length == 0) {
            this.f10184q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, this.f10179l.length);
        }
        this.f10180m.remove(vm4Var);
        this.f10179l[((Integer) obj).intValue()] = s11Var;
        if (this.f10180m.isEmpty()) {
            j(this.f10179l[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final c50 o0() {
        vm4[] vm4VarArr = this.f10178k;
        return vm4VarArr.length > 0 ? vm4VarArr[0].o0() : f10177t;
    }

    @Override // com.google.android.gms.internal.ads.cm4
    protected final /* bridge */ /* synthetic */ tm4 q(Object obj, tm4 tm4Var) {
        if (((Integer) obj).intValue() == 0) {
            return tm4Var;
        }
        return null;
    }
}
