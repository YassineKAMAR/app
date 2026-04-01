package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class l5 extends n1 implements s2 {
    private static final l5 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private e5 zzg;

    static {
        l5 l5Var = new l5();
        zzb = l5Var;
        n1.p(l5.class, l5Var);
    }

    private l5() {
    }

    static /* synthetic */ void A(l5 l5Var, p5 p5Var) {
        l5Var.zzf = p5Var;
        l5Var.zze = 4;
    }

    static /* synthetic */ void B(l5 l5Var, e5 e5Var) {
        l5Var.zzg = e5Var;
        l5Var.zzd |= 1;
    }

    static /* synthetic */ void C(l5 l5Var, o4 o4Var) {
        l5Var.zzf = o4Var;
        l5Var.zze = 2;
    }

    static /* synthetic */ void x(l5 l5Var, s4 s4Var) {
        l5Var.zzf = s4Var;
        l5Var.zze = 3;
    }

    public static k5 y() {
        return (k5) zzb.e();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", o4.class, s4.class, p5.class, b5.class});
        }
        if (i9 == 3) {
            return new l5();
        }
        j5 j5Var = null;
        if (i9 == 4) {
            return new k5(j5Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
