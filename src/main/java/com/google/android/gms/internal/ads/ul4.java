package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ul4 implements vm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f15761a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f15762b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dn4 f15763c = new dn4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lj4 f15764d = new lj4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f15765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s11 f15766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private pg4 f15767g;

    @Override // com.google.android.gms.internal.ads.vm4
    public /* synthetic */ boolean A() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public /* synthetic */ s11 M() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void X(um4 um4Var, g94 g94Var, pg4 pg4Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f15765e;
        boolean z7 = true;
        if (looper != null && looper != looperMyLooper) {
            z7 = false;
        }
        uu1.d(z7);
        this.f15767g = pg4Var;
        s11 s11Var = this.f15766f;
        this.f15761a.add(um4Var);
        if (this.f15765e == null) {
            this.f15765e = looperMyLooper;
            this.f15762b.add(um4Var);
            i(g94Var);
        } else if (s11Var != null) {
            h0(um4Var);
            um4Var.a(this, s11Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void a0(Handler handler, en4 en4Var) {
        this.f15763c.b(handler, en4Var);
    }

    protected final pg4 b() {
        pg4 pg4Var = this.f15767g;
        uu1.b(pg4Var);
        return pg4Var;
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void b0(um4 um4Var) {
        this.f15761a.remove(um4Var);
        if (!this.f15761a.isEmpty()) {
            e0(um4Var);
            return;
        }
        this.f15765e = null;
        this.f15766f = null;
        this.f15767g = null;
        this.f15762b.clear();
        k();
    }

    protected final lj4 c(tm4 tm4Var) {
        return this.f15764d.a(0, tm4Var);
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void c0(en4 en4Var) {
        this.f15763c.h(en4Var);
    }

    protected final lj4 d(int i8, tm4 tm4Var) {
        return this.f15764d.a(0, tm4Var);
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public abstract /* synthetic */ void d0(c50 c50Var);

    protected final dn4 e(tm4 tm4Var) {
        return this.f15763c.a(0, tm4Var);
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void e0(um4 um4Var) {
        boolean z7 = !this.f15762b.isEmpty();
        this.f15762b.remove(um4Var);
        if (z7 && this.f15762b.isEmpty()) {
            g();
        }
    }

    protected final dn4 f(int i8, tm4 tm4Var) {
        return this.f15763c.a(0, tm4Var);
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void f0(Handler handler, mj4 mj4Var) {
        this.f15764d.b(handler, mj4Var);
    }

    protected void g() {
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void g0(mj4 mj4Var) {
        this.f15764d.c(mj4Var);
    }

    protected void h() {
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public final void h0(um4 um4Var) {
        this.f15765e.getClass();
        HashSet hashSet = this.f15762b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(um4Var);
        if (zIsEmpty) {
            h();
        }
    }

    protected abstract void i(g94 g94Var);

    protected final void j(s11 s11Var) {
        this.f15766f = s11Var;
        ArrayList arrayList = this.f15761a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((um4) arrayList.get(i8)).a(this, s11Var);
        }
    }

    protected abstract void k();

    protected final boolean l() {
        return !this.f15762b.isEmpty();
    }
}
