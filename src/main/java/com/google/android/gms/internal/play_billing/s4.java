package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends n1 implements s2 {
    private static final s4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        s4 s4Var = new s4();
        zzb = s4Var;
        n1.p(s4.class, s4Var);
    }

    private s4() {
    }

    static /* synthetic */ void A(s4 s4Var, int i8) {
        s4Var.zzg = i8 - 1;
        s4Var.zzd |= 1;
    }

    public static r4 x() {
        return (r4) zzb.e();
    }

    static /* synthetic */ void z(s4 s4Var, i5 i5Var) {
        i5Var.getClass();
        s4Var.zzf = i5Var;
        s4Var.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object u(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return n1.j(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", p4.f19656a, i5.class});
        }
        if (i9 == 3) {
            return new s4();
        }
        q4 q4Var = null;
        if (i9 == 4) {
            return new r4(q4Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
