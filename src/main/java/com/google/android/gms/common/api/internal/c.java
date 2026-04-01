package com.google.android.gms.common.api.internal;

import y2.a;
import y2.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<A extends a.b, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x2.d[] f4846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4848c;

    public static class a<A extends a.b, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z2.i<A, s3.i<ResultT>> f4849a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private x2.d[] f4851c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f4850b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4852d = 0;

        /* synthetic */ a(z2.a0 a0Var) {
        }

        public c<A, ResultT> a() {
            a3.o.b(this.f4849a != null, "execute parameter required");
            return new s(this, this.f4851c, this.f4850b, this.f4852d);
        }

        public a<A, ResultT> b(z2.i<A, s3.i<ResultT>> iVar) {
            this.f4849a = iVar;
            return this;
        }

        public a<A, ResultT> c(boolean z7) {
            this.f4850b = z7;
            return this;
        }

        public a<A, ResultT> d(x2.d... dVarArr) {
            this.f4851c = dVarArr;
            return this;
        }

        public a<A, ResultT> e(int i8) {
            this.f4852d = i8;
            return this;
        }
    }

    protected c(x2.d[] dVarArr, boolean z7, int i8) {
        this.f4846a = dVarArr;
        boolean z8 = false;
        if (dVarArr != null && z7) {
            z8 = true;
        }
        this.f4847b = z8;
        this.f4848c = i8;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a8, s3.i<ResultT> iVar);

    public boolean c() {
        return this.f4847b;
    }

    public final int d() {
        return this.f4848c;
    }

    public final x2.d[] e() {
        return this.f4846a;
    }
}
