package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17434c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qq4[] f17435d = new qq4[100];

    public xq4(boolean z7, int i8) {
    }

    public final synchronized int a() {
        return this.f17433b * 65536;
    }

    public final synchronized qq4 b() {
        qq4 qq4Var;
        this.f17433b++;
        int i8 = this.f17434c;
        if (i8 > 0) {
            qq4[] qq4VarArr = this.f17435d;
            int i9 = i8 - 1;
            this.f17434c = i9;
            qq4Var = qq4VarArr[i9];
            qq4Var.getClass();
            qq4VarArr[i9] = null;
        } else {
            qq4Var = new qq4(new byte[65536], 0);
            int i10 = this.f17433b;
            qq4[] qq4VarArr2 = this.f17435d;
            int length = qq4VarArr2.length;
            if (i10 > length) {
                this.f17435d = (qq4[]) Arrays.copyOf(qq4VarArr2, length + length);
                return qq4Var;
            }
        }
        return qq4Var;
    }

    public final synchronized void c(qq4 qq4Var) {
        qq4[] qq4VarArr = this.f17435d;
        int i8 = this.f17434c;
        this.f17434c = i8 + 1;
        qq4VarArr[i8] = qq4Var;
        this.f17433b--;
        notifyAll();
    }

    public final synchronized void d(rq4 rq4Var) {
        while (rq4Var != null) {
            qq4[] qq4VarArr = this.f17435d;
            int i8 = this.f17434c;
            this.f17434c = i8 + 1;
            qq4VarArr[i8] = rq4Var.l();
            this.f17433b--;
            rq4Var = rq4Var.p();
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i8) {
        int i9 = this.f17432a;
        this.f17432a = i8;
        if (i8 < i9) {
            g();
        }
    }

    public final synchronized void g() {
        int i8 = this.f17432a;
        int i9 = nz2.f12300a;
        int iMax = Math.max(0, ((i8 + 65535) / 65536) - this.f17433b);
        int i10 = this.f17434c;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f17435d, iMax, i10, (Object) null);
        this.f17434c = iMax;
    }
}
