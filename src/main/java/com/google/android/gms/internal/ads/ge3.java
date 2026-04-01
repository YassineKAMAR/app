package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ge3 extends ae3 {
    /* synthetic */ ge3(ne3 ne3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final de3 a(le3 le3Var, de3 de3Var) {
        de3 de3Var2;
        synchronized (le3Var) {
            de3Var2 = le3Var.f10656b;
            if (de3Var2 != de3Var) {
                le3Var.f10656b = de3Var;
            }
        }
        return de3Var2;
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final ke3 b(le3 le3Var, ke3 ke3Var) {
        ke3 ke3Var2;
        synchronized (le3Var) {
            ke3Var2 = le3Var.f10657c;
            if (ke3Var2 != ke3Var) {
                le3Var.f10657c = ke3Var;
            }
        }
        return ke3Var2;
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final void c(ke3 ke3Var, ke3 ke3Var2) {
        ke3Var.f10057b = ke3Var2;
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final void d(ke3 ke3Var, Thread thread) {
        ke3Var.f10056a = thread;
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean e(le3 le3Var, de3 de3Var, de3 de3Var2) {
        synchronized (le3Var) {
            if (le3Var.f10656b != de3Var) {
                return false;
            }
            le3Var.f10656b = de3Var2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean f(le3 le3Var, Object obj, Object obj2) {
        synchronized (le3Var) {
            if (le3Var.f10655a != obj) {
                return false;
            }
            le3Var.f10655a = obj2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean g(le3 le3Var, ke3 ke3Var, ke3 ke3Var2) {
        synchronized (le3Var) {
            if (le3Var.f10657c != ke3Var) {
                return false;
            }
            le3Var.f10657c = ke3Var2;
            return true;
        }
    }
}
