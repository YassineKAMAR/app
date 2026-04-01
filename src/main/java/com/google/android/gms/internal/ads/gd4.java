package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class gd4 implements en4, mj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id4 f8301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kd4 f8302b;

    public gd4(kd4 kd4Var, id4 id4Var) {
        this.f8302b = kd4Var;
        this.f8301a = id4Var;
    }

    private final Pair b(int i8, tm4 tm4Var) {
        tm4 tm4VarA;
        tm4 tm4Var2 = null;
        if (tm4Var != null) {
            id4 id4Var = this.f8301a;
            int i9 = 0;
            while (true) {
                if (i9 >= id4Var.f9162c.size()) {
                    tm4VarA = null;
                    break;
                }
                if (((tm4) id4Var.f9162c.get(i9)).f15164d == tm4Var.f15164d) {
                    tm4VarA = tm4Var.a(Pair.create(id4Var.f9161b, tm4Var.f15161a));
                    break;
                }
                i9++;
            }
            if (tm4VarA == null) {
                return null;
            }
            tm4Var2 = tm4VarA;
        }
        return Pair.create(Integer.valueOf(this.f8301a.f9163d), tm4Var2);
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void C(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var) {
        final Pair pairB = b(0, tm4Var);
        if (pairB != null) {
            this.f8302b.f10046i.h(new Runnable() { // from class: com.google.android.gms.internal.ads.cd4
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairB;
                    this.f6321a.f8302b.f10045h.C(((Integer) pair.first).intValue(), (tm4) pair.second, km4Var, pm4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void D(int i8, tm4 tm4Var, final pm4 pm4Var) {
        final Pair pairB = b(0, tm4Var);
        if (pairB != null) {
            this.f8302b.f10046i.h(new Runnable() { // from class: com.google.android.gms.internal.ads.ed4
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairB;
                    this.f7275a.f8302b.f10045h.D(((Integer) pair.first).intValue(), (tm4) pair.second, pm4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void F(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var, final IOException iOException, final boolean z7) {
        final Pair pairB = b(0, tm4Var);
        if (pairB != null) {
            this.f8302b.f10046i.h(new Runnable() { // from class: com.google.android.gms.internal.ads.bd4
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairB;
                    this.f5759a.f8302b.f10045h.F(((Integer) pair.first).intValue(), (tm4) pair.second, km4Var, pm4Var, iOException, z7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void h(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var) {
        final Pair pairB = b(0, tm4Var);
        if (pairB != null) {
            this.f8302b.f10046i.h(new Runnable() { // from class: com.google.android.gms.internal.ads.dd4
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairB;
                    this.f6693a.f8302b.f10045h.h(((Integer) pair.first).intValue(), (tm4) pair.second, km4Var, pm4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.en4
    public final void p(int i8, tm4 tm4Var, final km4 km4Var, final pm4 pm4Var) {
        final Pair pairB = b(0, tm4Var);
        if (pairB != null) {
            this.f8302b.f10046i.h(new Runnable() { // from class: com.google.android.gms.internal.ads.fd4
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairB;
                    this.f7727a.f8302b.f10045h.p(((Integer) pair.first).intValue(), (tm4) pair.second, km4Var, pm4Var);
                }
            });
        }
    }
}
