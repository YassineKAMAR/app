package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends n1 implements s2 {
    private static final i5 zzb;
    private int zzd;
    private int zze;

    static {
        i5 i5Var = new i5();
        zzb = i5Var;
        n1.p(i5.class, i5Var);
    }

    private i5() {
    }

    public static g5 x() {
        return (g5) zzb.e();
    }

    static /* synthetic */ void z(i5 i5Var, int i8) {
        i5Var.zze = i8 - 1;
        i5Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", h5.f19568a});
        }
        if (i9 == 3) {
            return new i5();
        }
        f5 f5Var = null;
        if (i9 == 4) {
            return new g5(f5Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
