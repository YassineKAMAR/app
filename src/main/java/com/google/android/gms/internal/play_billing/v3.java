package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class v3 extends t3 {
    v3() {
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* synthetic */ int a(Object obj) {
        return ((u3) obj).a();
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* synthetic */ int b(Object obj) {
        return ((u3) obj).b();
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        n1 n1Var = (n1) obj;
        u3 u3Var = n1Var.zzc;
        if (u3Var != u3.c()) {
            return u3Var;
        }
        u3 u3VarF = u3.f();
        n1Var.zzc = u3VarF;
        return u3VarF;
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* synthetic */ Object d(Object obj) {
        return ((n1) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (u3.c().equals(obj2)) {
            return obj;
        }
        u3 u3Var = (u3) obj2;
        if (u3.c().equals(obj)) {
            return u3.e((u3) obj, u3Var);
        }
        ((u3) obj).d(u3Var);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* bridge */ /* synthetic */ void f(Object obj, int i8, long j8) {
        ((u3) obj).j(i8 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final void g(Object obj) {
        ((n1) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* synthetic */ void h(Object obj, Object obj2) {
        ((n1) obj).zzc = (u3) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.t3
    final /* synthetic */ void i(Object obj, l4 l4Var) {
        ((u3) obj).k(l4Var);
    }
}
